/**
 *
 */
package org.dcg.auto.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.dcg.auto.data.dao.MemberDAO;
import org.dcg.auto.data.model.Member;
import org.dcg.auto.service.MemberService;

/**
 * @author ndennis
 *
 */

@Stateless
public class MemberServiceImpl implements MemberService {

    @Inject
    MemberDAO memberDAO;

    /*
     * (non-Javadoc)
     *
     * @see org.dcg.auto.service.InventoryService#findInventory(int, int,
     * java.lang.String, java.lang.String)
     */
    @Override
    public List<Member> findMember(int startPosition, int maxResults, String sortFields, String sortDirections) {
        return memberDAO.findMember(startPosition, maxResults, sortFields, sortDirections);
    }

    @Override
    public Integer count() {
        return memberDAO.count();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.dcg.auto.service.InventoryService#findById(java.lang.Integer)
     */
    @Override
    public Member findById(Long id) {
        return memberDAO.getById(id);
    }
}
