/**
 *
 */
package org.dcg.auto.data.dao;

import java.util.List;

import org.dcg.auto.data.model.Inventory;

/**
 * @author ndennis
 *
 */
public interface InventoryDAO extends BaseDAO<Inventory> {


    /**
     * @param query
     * @param isActive
     * @return
     */
    Integer countInventory(String query, Boolean isActive);


    /**
     * @param startPosition
     * @param maxResults
     * @param sortFields
     * @param sortDirections
     * @param query
     * @param isActive
     * @return
     */
    List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections, String query, Boolean isActive);

}
