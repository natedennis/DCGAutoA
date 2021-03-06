package org.dcg.auto.data.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "member_role", catalog = "dcg_auto")
public class MemberRole implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -8677718016335892566L;
    private Integer id;
    private int roleId;
    private int memberId;
    private Date createDate;

    public MemberRole() {
    }

    public MemberRole(int roleId, int memberId) {
        this.roleId = roleId;
        this.memberId = memberId;
    }

    public MemberRole(int roleId, int memberId, Date createDate) {
        this.roleId = roleId;
        this.memberId = memberId;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Column(name = "member_id", nullable = false)
    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", length = 10)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
