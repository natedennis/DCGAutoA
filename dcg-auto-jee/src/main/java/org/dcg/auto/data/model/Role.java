package org.dcg.auto.data.model;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "role", catalog = "dcg_auto")
public class Role  implements java.io.Serializable {


    /**
     *
     */
    private static final long serialVersionUID = -3187381671993243584L;
    private Integer id;
    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name="name", length=100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }




}


