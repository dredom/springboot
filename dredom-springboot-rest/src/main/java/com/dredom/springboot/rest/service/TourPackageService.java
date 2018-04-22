/**
 *
 */
package com.dredom.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dredom.springboot.rest.domain.TourPackage;
import com.dredom.springboot.rest.repo.TourPackageRepository;


/**
 * The @Service annotation is also a specialization of the component annotation.
 * @Component annotation makes something a bean.
 * It’s a good idea to use @Service over @Component in service-layer classes because it specifies intent better.
 * @author andre
 *
 */
@Service
public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourPackageService(TourPackageRepository tourPackageRepository) {
        super();
        this.tourPackageRepository = tourPackageRepository;
    }

    public TourPackage createTourPackage(String code, String name) {
        if (!tourPackageRepository.exists(code)) {
            return tourPackageRepository.save(new TourPackage(code, name));
        }
        return null;
    }
    public Iterable<TourPackage> lookup() {
        return tourPackageRepository.findAll();
    }
    public long total() {
        return tourPackageRepository.count();
    }
}
