package org.dcg.auto.data.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "inventory_attribute", catalog = "dcg_auto")
public class InventoryAttribute implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7915029816906057165L;
    private Integer id;
    private int inventoryId;
    private String attri;
    private String type;
    private String name;
    private String description;
    private String val;
    private Integer displayOrder;
    private Integer isActive;

    public InventoryAttribute() {
    }

    public InventoryAttribute(int inventoryId, String attri, String type, String name) {
        this.inventoryId = inventoryId;
        this.attri = attri;
        this.type = type;
        this.name = name;
    }

    public InventoryAttribute(int inventoryId, String attri, String type, String name, String description, String val, Integer displayOrder, Integer isActive) {
        this.inventoryId = inventoryId;
        this.attri = attri;
        this.type = type;
        this.name = name;
        this.description = description;
        this.val = val;
        this.displayOrder = displayOrder;
        this.isActive = isActive;
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

    @Column(name = "attri", nullable = false)
    public String getAttri() {
        return this.attri;
    }

    public void setAttri(String attri) {
        this.attri = attri;
    }

    @Column(name = "type", nullable = false, length = 100)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "name", nullable = false, length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "val")
    public String getVal() {
        return this.val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Column(name = "display_order")
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Column(name = "is_active")
    public Integer getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

}
