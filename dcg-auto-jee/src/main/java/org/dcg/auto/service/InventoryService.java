/**
 *
 */
package org.dcg.auto.service;

import java.util.List;

import org.dcg.auto.data.model.Inventory;

/**
 * @author ndennis
 *
 */
public interface InventoryService {

    List<Inventory> findInventory(int startPosition, int maxResults, String sortFields, String sortDirections);

    /**
     * @return
     */
    Integer countInventory();

    Inventory findById(Long id);

}
