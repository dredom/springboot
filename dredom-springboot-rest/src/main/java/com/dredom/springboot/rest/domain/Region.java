/**
 *
 */
package com.dredom.springboot.rest.domain;

/**
 * @author andre
 *
 */
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
