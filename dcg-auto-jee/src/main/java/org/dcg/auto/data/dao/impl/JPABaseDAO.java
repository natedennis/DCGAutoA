/**
 *
 */
package org.dcg.auto.data.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dcg.auto.data.dao.BaseDAO;

/**
 * @author ndennis
 *
 */

@Stateless
public class JPABaseDAO<T> implements BaseDAO<T> {

    @PersistenceContext
    private EntityManager entityManager;

    private final Class<T> entityType;

    @SuppressWarnings("unchecked")
    public JPABaseDAO() {
        this.entityType = ((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }

    @Override
    public T getById(Long Id) {
        return entityManager.find(entityType, Id);
    }

    @Override
    public void save(T type) {
        entityManager.persist(type);
    }

    @Override
    public T update(T type) {
        return entityManager.merge(type);
    }

    @Override
    public void delete(T type) {
        entityManager.remove(entityManager.contains(type) ? type : entityManager.merge(type));
    }

}