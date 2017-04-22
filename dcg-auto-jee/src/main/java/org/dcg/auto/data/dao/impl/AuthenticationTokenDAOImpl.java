package org.dcg.auto.data.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.dcg.auto.data.dao.AuthenticationTokenDAO;
import org.dcg.auto.data.model.AuthenticationToken;

/**
 * @author ndennis
 *
 */
@Stateless
public class AuthenticationTokenDAOImpl extends JPABaseDAO<AuthenticationToken> implements AuthenticationTokenDAO {

    @PersistenceContext
    private EntityManager entityManager;



}