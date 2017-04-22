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
    public List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections) {
        Query query = entityManager.createQuery("SELECT i FROM Inventory i ORDER BY p." + sortFields + " " + sortDirections);
        query.setFirstResult(startPosition);
        query.setMaxResults(maxResults);
        return query.getResultList();
    }

    @Override
    public Integer countInventory() {
        Query query = entityManager.createQuery("SELECT COUNT(i.id) FROM Inventory i");
        return ((Long) query.getSingleResult()).intValue();
    }

}
