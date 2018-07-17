package com.dredom.springboot.rest.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dredom.springboot.rest.domain.TourRating;
import com.dredom.springboot.rest.domain.TourRatingPk;

@RepositoryRestResource(exported = false)   // Do not expose on the REST API
public interface TourRatingRepository extends CrudRepository<TourRating, TourRatingPk> {

    /**
     * Find all the tour ratings for a tour.
     * @param tourId
     * @return List TourRating
     */
    List<TourRating> findByPkTourId(Integer tourId);

    /**
     * Lookup rating by the tour id and the customer id.
     * @param tourId
     * @param customerId
     * @return TourRating, or null
     */
    TourRating findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);
}
