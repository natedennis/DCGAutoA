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
     * @param startPosition
     * @param maxResults
     * @param sortFields
     * @param sortDirections
     * @return
     */
    List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections);

    /**
     * @return
     */
    Integer countInventory();

}
