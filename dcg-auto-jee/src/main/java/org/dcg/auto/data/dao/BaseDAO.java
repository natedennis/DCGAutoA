/**
 *
 */
package org.dcg.auto.data.dao;

/**
 * @author ndennis
 *
 */
public interface BaseDAO<T> {

    T getById(Long id);

    void save(T type);

    T update(T type);

    void delete(T type);
}
