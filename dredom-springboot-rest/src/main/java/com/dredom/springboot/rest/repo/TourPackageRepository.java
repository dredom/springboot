/**
 *
 */
package com.dredom.springboot.rest.repo;

import org.springframework.data.repository.CrudRepository;

import com.dredom.springboot.rest.domain.TourPackage;


/**
 * Boilerplate JPA.
 * @author andre
 *
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

}
