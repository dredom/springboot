/**
 *
 */
package com.dredom.springboot.rest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author andre
 *
 */
@Entity
public class TourPackage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String code;
    @Column
    private String name;

    public TourPackage() {
        // TODO Auto-generated constructor stub
    }
    public TourPackage(String code, String name) {
        super();
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TourPackage [code=" + code + ", name=" + name + "]";
    }

}
