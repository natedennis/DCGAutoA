/**
 *
 */
package org.dcg.auto.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.dcg.auto.data.dao.InventoryDAO;
import org.dcg.auto.data.model.Inventory;
import org.dcg.auto.service.InventoryService;

/**
 * @author ndennis
 *
 */

@Stateless
public class InventoryServiceImpl implements InventoryService {

    @Inject
    InventoryDAO inventoryDAO;

    /*
     * (non-Javadoc)
     *
     * @see org.dcg.auto.service.InventoryService#findInventory(int, int,
     * java.lang.String, java.lang.String)
     */
    @Override
    public List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections) {
        return inventoryDAO.findInventory(startPosition, maxResults, sortFields, sortDirections);
    }

    @Override
    public Integer countInventory() {
        return inventoryDAO.countInventory();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.dcg.auto.service.InventoryService#findById(java.lang.Integer)
     */
    @Override
    public Inventory findById(Long id) {
        return inventoryDAO.getById(id);
    }
}
