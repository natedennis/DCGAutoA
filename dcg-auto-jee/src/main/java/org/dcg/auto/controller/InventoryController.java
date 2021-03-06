/**
 *
 */
package org.dcg.auto.controller;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.dcg.auto.data.model.Inventory;
import org.dcg.auto.data.pagination.PaginatedInventoryListWrapper;
import org.dcg.auto.service.InventoryService;
import org.dcg.auto.service.MemberService;
/**
 * @author ndennis
 *
 */
@Stateless
@ApplicationPath("/resources")
@Path("inventory")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InventoryController extends Application {

    @Inject
    private InventoryService inventoryService;

    @Inject
    private MemberService memberService;

    private PaginatedInventoryListWrapper findInventory(PaginatedInventoryListWrapper wrapper) {
        wrapper.setTotalResults(inventoryService.countInventory(wrapper.getQuery(), Boolean.TRUE));

        int start = (wrapper.getCurrentPage() - 1) * wrapper.getPageSize();
        wrapper.setList(inventoryService.findInventory(start,
                wrapper.getPageSize(),
                wrapper.getSortFields(),
                wrapper.getSortDirections(),
                wrapper.getQuery(),
                Boolean.TRUE));
        return wrapper;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listInventory(
            @Context SecurityContext context,
            @DefaultValue("1") @QueryParam("page") Integer page,
            @DefaultValue("10") @QueryParam("pageSize") Integer pageSize,
            @DefaultValue("id") @QueryParam("sortFields") String sortFields,
            @DefaultValue("asc") @QueryParam("sortDirections") String sortDirections,
            @QueryParam("query") String query) {
        PaginatedInventoryListWrapper plw = new PaginatedInventoryListWrapper();
        plw.setCurrentPage(page);
        plw.setSortFields(sortFields);
        plw.setSortDirections(sortDirections);
        plw.setPageSize(pageSize);
        plw.setQuery(query);
        return Response.ok(findInventory(plw)).header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("{id}")
    public Response getInventory(
            @Context SecurityContext context,
            @PathParam("id") Integer id) {
        Inventory inv = inventoryService.findById(Long.valueOf(id));
        return Response.ok(inv).header("Access-Control-Allow-Origin", "*").build();
    }

    //    private Member getUser(SecurityContext context) {
    //        Principal principal = null;
    //
    //        if (context != null)
    //            principal = context.getUserPrincipal();
    //
    //        if (principal == null)
    //            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
    //
    //        return getMember(principal.getName());
    //    }
    //
    //    private Member getMember(String username) {
    //
    //        try {
    //            Member mem = memberService.getForUsername(username);
    //
    //            if (mem == null) {
    //                mem = new Member(username);
    //
    //                memberService.createUser(mem);
    //            }
    //
    //            return mem;
    //        } catch (Exception e) {
    //            throw new WebApplicationException(e);
    //        }
    //    }

    //    @POST
    //    public Inventory savePerson(Inventory person) {
    //        if (person.getId() == null) {
    //            Inventory personToSave = new Person();
    //            personToSave.setName(person.getName());
    //            personToSave.setDescription(person.getDescription());
    //            personToSave.setImageUrl(person.getImageUrl());
    //            entityManager.persist(person);
    //        } else {
    //            Person personToUpdate = getPerson(person.getId());
    //            personToUpdate.setName(person.getName());
    //            personToUpdate.setDescription(person.getDescription());
    //            personToUpdate.setImageUrl(person.getImageUrl());
    //            person = entityManager.merge(personToUpdate);
    //        }
    //
    //        return person;
    //    }

}
