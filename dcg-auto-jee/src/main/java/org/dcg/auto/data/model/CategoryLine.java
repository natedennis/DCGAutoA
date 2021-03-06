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
@Table(name = "category_line", catalog = "dcg_auto")
public class CategoryLine implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 782172805962648532L;
    private Integer id;
    private int categoryId;
    private String name;
    private int isActive;
    private Date createDate;

    public CategoryLine() {
    }

    public CategoryLine(int categoryId, String name, int isActive) {
        this.categoryId = categoryId;
        this.name = name;
        this.isActive = isActive;
    }

    public CategoryLine(int categoryId, String name, int isActive, Date createDate) {
        this.categoryId = categoryId;
        this.name = name;
        this.isActive = isActive;
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

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
