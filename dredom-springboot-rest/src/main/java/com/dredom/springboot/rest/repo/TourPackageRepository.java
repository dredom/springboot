/**
 *
 */
package com.dredom.springboot.rest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dredom.springboot.rest.domain.TourPackage;


/**
 * Boilerplate JPA.
 * @author andre
 *
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

    TourPackage findByName(@Param("name") String name);
}
