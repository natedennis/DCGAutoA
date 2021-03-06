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
@Table(name = "authentication_token", catalog = "dcg_auto")
public class AuthenticationToken implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2863602073725592599L;
    private Integer id;
    private String username;
    private String valu;
    private Date createDate;

    public AuthenticationToken() {
    }

    public AuthenticationToken(String username, String valu, Date createDate) {
        this.username = username;
        this.valu = valu;
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

    @Column(name = "username")
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "valu", length = 21844)
    public String getValu() {
        return this.valu;
    }

    public void setValu(String valu) {
        this.valu = valu;
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
