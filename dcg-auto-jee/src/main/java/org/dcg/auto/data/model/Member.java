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
@Table(name = "member", catalog = "dcg_auto")
public class Member implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1541316081536526342L;
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String businessName;
    private String passwordHash;
    private String tokenValue;
    private Date lastLogin;
    private Integer loginCount;
    private Date createDate;
    private Integer roleId;

    public Member() {
    }

    public Member(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Member(String email, String firstName, String lastName, String businessName, String passwordHash, String tokenValue, Date lastLogin,
            Integer loginCount, Date createDate, Integer roleId) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.passwordHash = passwordHash;
        this.tokenValue = tokenValue;
        this.lastLogin = lastLogin;
        this.loginCount = loginCount;
        this.createDate = createDate;
        this.roleId = roleId;
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

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "business_name", length = 200)
    public String getBusinessName() {
        return this.businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Column(name = "password_hash", length = 21844)
    public String getPasswordHash() {
        return this.passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Column(name = "token_value", length = 21844)
    public String getTokenValue() {
        return this.tokenValue;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "last_login", length = 10)
    public Date getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Column(name = "login_count")
    public Integer getLoginCount() {
        return this.loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", length = 10)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "role_id")
    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
