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
@Table(name = "image", catalog = "dcg_auto")
public class Image implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -9131381582450105825L;
    private Integer id;
    private int inventoryId;
    private String name;
    private String uri;
    private String contentType;
    private String comment;
    private Date createDate;
    private Integer isPublicViewable;
    private Integer isActive;
    private Integer imageOrder;

    public Image() {
    }

    public Image(int inventoryId, String contentType) {
        this.inventoryId = inventoryId;
        this.contentType = contentType;
    }

    public Image(int inventoryId, String name, String uri, String contentType, String comment, Date createDate, Integer isPublicViewable, Integer isActive,
            Integer imageOrder) {
        this.inventoryId = inventoryId;
        this.name = name;
        this.uri = uri;
        this.contentType = contentType;
        this.comment = comment;
        this.createDate = createDate;
        this.isPublicViewable = isPublicViewable;
        this.isActive = isActive;
        this.imageOrder = imageOrder;
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

    @Column(name = "inventory_id", nullable = false)
    public int getInventoryId() {
        return this.inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    @Column(name = "name", length = 250)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "uri", length = 250)
    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Column(name = "content_type", nullable = false, length = 250)
    public String getContentType() {
        return this.contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Column(name = "comment", length = 250)
    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "create_date", length = 10)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "is_public_viewable")
    public Integer getIsPublicViewable() {
        return this.isPublicViewable;
    }

    public void setIsPublicViewable(Integer isPublicViewable) {
        this.isPublicViewable = isPublicViewable;
    }

    @Column(name = "is_active")
    public Integer getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @Column(name = "image_order")
    public Integer getImageOrder() {
        return this.imageOrder;
    }

    public void setImageOrder(Integer imageOrder) {
        this.imageOrder = imageOrder;
    }

}
