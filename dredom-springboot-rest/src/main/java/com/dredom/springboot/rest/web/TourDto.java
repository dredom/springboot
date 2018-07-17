package com.dredom.springboot.rest.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * javax.validations - whenever passed into the create method Java will do the validations for us.
 * When it is passed in as a payload on the controller.
 * @author andre
 *
 */
public class TourDto {

    @Min(0)
    @Max(5)
    private Integer score;
    @Size(max = 255)
    private String comment;
    @NotNull
    private Integer customerId;

    protected TourDto(Integer score, String comment, Integer customerId) {
        super();
        this.score = score;
        this.comment = comment;
        this.customerId = customerId;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

}
