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
@Table(name = "make", catalog = "dcg_auto")
public class Make implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5966117848651236600L;
    private Integer id;
    private String name;
    private Integer makeOrder;
    private Date createDate;

    public Make() {
    }

    public Make(String name) {
        this.name = name;
    }

    public Make(String name, Integer makeOrder, Date createDate) {
        this.name = name;
        this.makeOrder = makeOrder;
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

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "make_order")
    public Integer getMakeOrder() {
        return this.makeOrder;
    }

    public void setMakeOrder(Integer makeOrder) {
        this.makeOrder = makeOrder;
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
