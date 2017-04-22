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
import javax.ws.rs.core.MediaType;

import org.dcg.auto.data.model.Inventory;
import org.dcg.auto.data.pagination.PaginatedInventoryListWrapper;
import org.dcg.auto.service.InventoryService;
/**
 * @author ndennis
 *
 */
@Stateless
@ApplicationPath("/resources")
@Path("persons")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InventoryController extends Application {

    @Inject
    private InventoryService inventoryService;

    private PaginatedInventoryListWrapper findPersons(PaginatedInventoryListWrapper wrapper) {
        wrapper.setTotalResults(inventoryService.countInventory());

        int start = (wrapper.getCurrentPage() - 1) * wrapper.getPageSize();
        wrapper.setList(inventoryService.findInventory(start,
                wrapper.getPageSize(),
                wrapper.getSortFields(),
                wrapper.getSortDirections()));
        return wrapper;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PaginatedInventoryListWrapper listPersons(
            @DefaultValue("1") @QueryParam("page") Integer page,
            @DefaultValue("id") @QueryParam("sortFields") String sortFields,
            @DefaultValue("asc") @QueryParam("sortDirections") String sortDirections) {
        PaginatedInventoryListWrapper plw = new PaginatedInventoryListWrapper();
        plw.setCurrentPage(page);
        plw.setSortFields(sortFields);
        plw.setSortDirections(sortDirections);
        plw.setPageSize(10);
        return findPersons(plw);
    }

    @GET
    @Path("{id}")
    public Inventory getInventory(@PathParam("id") Long id) {
        return inventoryService.findById(id);
    }

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
