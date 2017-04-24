/**
 *
 */
package org.dcg.auto.data.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.dcg.auto.data.dao.MemberDAO;
import org.dcg.auto.data.model.Member;

/**
 * @author ndennis
 *
 */
@Stateless
public class MemberDAOImpl extends JPABaseDAO<Member> implements MemberDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<Member> findMember(int startPosition, int maxResults, String sortFields, String sortDirections) {
        Query query = entityManager.createQuery("SELECT i FROM Member i ORDER BY i." + sortFields + " " + sortDirections);
        query.setFirstResult(startPosition);
        query.setMaxResults(maxResults);
        return query.getResultList();
    }

    @Override
    public Integer count() {
        Query query = entityManager.createQuery("SELECT COUNT(i.id) FROM Member i");
        return ((Long) query.getSingleResult()).intValue();
    }

}
