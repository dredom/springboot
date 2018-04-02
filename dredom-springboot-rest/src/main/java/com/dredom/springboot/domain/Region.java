/**
 *
 */
package com.dredom.springboot.domain;

import javax.persistence.Entity;

/**
 * @author andre
 *
 */
@Entity
public enum Region {
    Central_California("Central California"), Northern_California("Northern California"),
    Southern_California("Southern California"), Varies("Varies");
    private String label;
    private Region(String label) {
        this.label = label;
    }
    public static Region findByLabel(String label) {
        for (Region item : values()) {
            if (label.equalsIgnoreCase(item.label)) {
                return item;
            }
        }
        return null;
    }
}
