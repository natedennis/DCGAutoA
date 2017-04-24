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
    private int makeId;
    private String title;
    private String descript;
    private String newused;
    private Date dateListed;
    private Date dateDeleted;
    private Date createDate;
    private String isActive;
    private String fileList;
    private Integer social;

    public Inventory() {
    }

    public Inventory(int year, int catagoryLineId, int makeId, Date createDate, String isActive) {
        this.year = year;
        this.catagoryLineId = catagoryLineId;
        this.makeId = makeId;
        this.createDate = createDate;
        this.isActive = isActive;
    }

    public Inventory(String stockNumber, int year, int catagoryLineId, int makeId, String title, String descript, String newused, Date dateListed,
            Date dateDeleted, Date createDate, String isActive, String fileList, Integer social) {
        this.stockNumber = stockNumber;
        this.year = year;
        this.catagoryLineId = catagoryLineId;
        this.makeId = makeId;
        this.title = title;
        this.descript = descript;
        this.newused = newused;
        this.dateListed = dateListed;
        this.dateDeleted = dateDeleted;
        this.createDate = createDate;
        this.isActive = isActive;
        this.fileList = fileList;
        this.social = social;
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

    @Column(name = "make_id", nullable = false)
    public int getMakeId() {
        return this.makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    @Column(name = "title", length = 150)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "descript", length = 21844)
    public String getDescript() {
        return this.descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Column(name = "newused", length = 4)
    public String getNewused() {
        return this.newused;
    }

    public void setNewused(String newused) {
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

    @Column(name = "is_active", nullable = false, length = 3)
    public String getIsActive() {
        return this.isActive;
    }

    public void setIsActive(String isActive) {
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
    public Integer getSocial() {
        return this.social;
    }

    public void setSocial(Integer social) {
        this.social = social;
    }

}
