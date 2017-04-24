package org.dcg.auto.data.dao;

import java.util.List;

import org.dcg.auto.data.model.Member;

/**
 * @author ndennis
 *
 */
public interface MemberDAO extends BaseDAO<Member> {

    /**
     * @param startPosition
     * @param maxResults
     * @param sortFields
     * @param sortDirections
     * @return
     */
    List<Member> findMember(int startPosition, int maxResults, String sortFields, String sortDirections);

    /**
     * @return
     */
    Integer count();

}
