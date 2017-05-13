/**
 *
 */
package org.dcg.auto.data.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.dcg.auto.data.dao.InventoryDAO;
import org.dcg.auto.data.model.Inventory;

/**
 * @author ndennis
 *
 */
@Stateless
public class InventoryDAOImpl extends JPABaseDAO<Inventory> implements InventoryDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections, String query, Boolean isActive) {
        StringBuilder sb = new StringBuilder("SELECT i FROM Inventory i where i.isActive =:isactive ");

        if (query != null && query.length() > 0) {
            sb.append(" and ( i.stockNumber like :query or i.title like :query or i.descript like :query) ");
        }
        sb.append("ORDER BY i." + sortFields + " " + sortDirections);

        Query q = entityManager.createQuery(sb.toString());
        if(isActive!=null) {
            q.setParameter("isactive", isActive);
        } else {
            q.setParameter("isactive", Boolean.TRUE);
        }
        if (query != null && query.length() > 0) {
            q.setParameter("query", "%"+query+"%");
        }


        q.setFirstResult(startPosition);
        q.setMaxResults(maxResults);
        return q.getResultList();
    }

    @Override
    public Integer countInventory(String query, Boolean isActive) {
        StringBuilder sb = new StringBuilder("SELECT COUNT(i.id) FROM Inventory i where i.isActive =:isactive ");
        if (query != null && query.length() > 0) {
            sb.append(" and ( i.stockNumber like :query or i.title like :query or i.descript like :query) ");
        }
        Query q = entityManager.createQuery(sb.toString());
        if(isActive!=null) {
            q.setParameter("isactive", isActive);
        } else {
            q.setParameter("isactive", Boolean.TRUE);
        }
        if (query != null && query.length() > 0) {
            q.setParameter("query", "%"+query+"%");
        }
        return ((Long) q.getSingleResult()).intValue();
    }

}
