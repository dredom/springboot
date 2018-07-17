/**
 *
 */
package com.dredom.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dredom.springboot.rest.domain.Difficulty;
import com.dredom.springboot.rest.domain.Region;
import com.dredom.springboot.rest.domain.Tour;
import com.dredom.springboot.rest.domain.TourPackage;
import com.dredom.springboot.rest.repo.TourPackageRepository;
import com.dredom.springboot.rest.repo.TourRepository;


/**
 * @author andre
 *
 */
@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;
    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        super();
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    public Tour createTour(String title, String description, String blurb, Integer price, String duration,
            String bullets, String keywords, String tourPackageCode, Difficulty difficulty) {
        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageCode);
        if (tourPackage == null) {
            throw new RuntimeException("TourPackage " + tourPackageCode + " not found");
        }
        Region region = Region.Central_California;
        return tourRepository.save(new Tour(title, description,blurb, price, duration, bullets, keywords, tourPackage, difficulty, region));
    }
    public Iterable<Tour> lookup() {
        return tourRepository.findAll();
    }
    public long total() {
        return tourRepository.count();
    }
}
