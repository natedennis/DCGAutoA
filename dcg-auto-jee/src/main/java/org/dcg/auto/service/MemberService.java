/**
 *
 */
package org.dcg.auto.service;

import java.util.List;

import org.dcg.auto.data.model.Member;

/**
 * @author ndennis
 *
 */
public interface MemberService {

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

    /**
     * @param id
     * @return
     */
    Member findById(Long id);

}
