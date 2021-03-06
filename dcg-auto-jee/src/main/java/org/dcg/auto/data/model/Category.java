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
@Table(name = "category", catalog = "dcg_auto")
public class Category implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -256300983330722050L;
    private Long id;
    private String name;
    private int isUsed;
    private int isActive;
    private Date createDate;

    public Category() {
    }

    public Category(String name, int isUsed, int isActive) {
        this.name = name;
        this.isUsed = isUsed;
        this.isActive = isActive;
    }

    public Category(String name, int isUsed, int isActive, Date createDate) {
        this.name = name;
        this.isUsed = isUsed;
        this.isActive = isActive;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "is_used", nullable = false)
    public int getIsUsed() {
        return this.isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }

    @Column(name = "is_active", nullable = false)
    public int getIsActive() {
        return this.isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
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
