package org.dcg.auto.data.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member_contact", catalog = "dcg_auto")
public class MemberContact implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5396893190832324209L;
    private Integer id;
    private int memberId;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zip;
    private String phone;
    private Integer optOut;

    public MemberContact() {
    }

    public MemberContact(int memberId) {
        this.memberId = memberId;
    }

    public MemberContact(int memberId, String street, String city, String state, String country, String zip, String phone, Integer optOut) {
        this.memberId = memberId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
        this.phone = phone;
        this.optOut = optOut;
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

    @Column(name = "member_id", nullable = false)
    public int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Column(name = "street", length = 50)
    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "city", length = 50)
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "state", length = 2)
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "country", length = 30)
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "zip", length = 10)
    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Column(name = "phone", length = 15)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "opt_out")
    public Integer getOptOut() {
        return this.optOut;
    }

    public void setOptOut(Integer optOut) {
        this.optOut = optOut;
    }

}
