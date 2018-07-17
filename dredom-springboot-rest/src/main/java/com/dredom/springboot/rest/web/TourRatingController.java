/**
 *
 */
package com.dredom.springboot.rest.web;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dredom.springboot.rest.domain.Tour;
import com.dredom.springboot.rest.repo.TourRatingRepository;
import com.dredom.springboot.rest.repo.TourRepository;

/**
 * @author andre
 *
 */
@RestController
@RequestMapping(path = "/tours/{tourId}/ratings")
public class TourRatingController {

    TourRatingRepository tourRatingRepository;
    TourRepository tourRepository;

    @Autowired
    protected TourRatingController(TourRatingRepository tourRatingRepository, TourRepository tourRepository) {
        super();
        this.tourRatingRepository = tourRatingRepository;
        this.tourRepository = tourRepository;
    }

    public Tour verifyTour(int tourId) throws NoSuchElementException {
        Tour tour = tourRepository.findOne(tourId);
        if (tour == null) {
            throw new NoSuchElementException("Tour not found " + tourId);
        }
        return tour;
    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = NoSuchElementException.class)
    public String return400(NoSuchElementException ex) {
        return ex.getMessage();
    }
}
