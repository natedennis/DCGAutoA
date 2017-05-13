package org.dcg.auto.data.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "inventory", catalog = "dcg_auto")
public class Inventory implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2968766832565486085L;
    private Long id;
    private String stockNumber;
    private int year;
    private int catagoryLineId;
    private Make make;
    private String title;
    private BigDecimal price;
    private String descript;
    private Boolean newused;
    private Date dateListed;
    private Date dateDeleted;
    private Date createDate;
    private Boolean isActive;
    private String fileList;
    private Boolean social;

    public Inventory() {
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

    @Column(name = "stock_number", length = 10)
    public String getStockNumber() {
        return this.stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    @Column(name = "year", nullable = false)
    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Column(name = "catagory_line_id", nullable = false)
    public int getCatagoryLineId() {
        return this.catagoryLineId;
    }

    public void setCatagoryLineId(int catagoryLineId) {
        this.catagoryLineId = catagoryLineId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "make_id", nullable = false)
    public Make getMake() {
        return this.make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    @Column(name = "title", length = 150)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "price", columnDefinition = "Decimal(10,2) default '0.00'")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "descript", length = 21844)
    public String getDescript() {
        return this.descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Column(name = "newused", length = 4)
    public Boolean getNewused() {
        return this.newused;
    }

    public void setNewused(Boolean newused) {
        this.newused = newused;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_listed", length = 10)
    public Date getDateListed() {
        return this.dateListed;
    }

    public void setDateListed(Date dateListed) {
        this.dateListed = dateListed;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date_deleted", length = 10)
    public Date getDateDeleted() {
        return this.dateDeleted;
    }

    public void setDateDeleted(Date dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", nullable = false, length = 10)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "is_active", nullable = false)
    public Boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @Column(name = "file_list", length = 21844)
    public String getFileList() {
        return this.fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
    }

    @Column(name = "social")
    public Boolean getSocial() {
        return this.social;
    }

    public void setSocial(Boolean social) {
        this.social = social;
    }

}
