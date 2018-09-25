/**
 *
 */
package com.dredom.springboot.rest.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author andre
 *
 */
public class RatingDto {

    @Min(0)
    @Max(5)
    private Integer score;

    @Size(max = 255)
    private String comment;

    @NotNull
    private Integer cusomerId;

    public RatingDto(Integer score, String comment, Integer cusomerId) {
        super();
        this.score = score;
        this.comment = comment;
        this.cusomerId = cusomerId;
    }
    protected RatingDto() {
        super();
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
    public Integer getCusomerId() {
        return cusomerId;
    }
    public void setCusomerId(Integer cusomerId) {
        this.cusomerId = cusomerId;
    }

}
