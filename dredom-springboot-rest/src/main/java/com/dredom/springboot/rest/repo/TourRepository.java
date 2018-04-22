/**
 *
 */
package com.dredom.springboot.rest.repo;

import org.springframework.data.repository.CrudRepository;

import com.dredom.springboot.rest.domain.Tour;


/**
 * Takes care of boilerplate JPA stuff.
 * @author andre
 *
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {

}
