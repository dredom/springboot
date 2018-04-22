package com.dredom.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dredom.springboot.rest.service.TourPackageService;
import com.dredom.springboot.rest.service.TourService;



@SpringBootApplication
public class DredomSpringbootRestApplication implements CommandLineRunner {
    @Autowired
    private TourPackageService tourPackageService;
    @Autowired
    private TourService tourService;

	public static void main(String[] args) {
		SpringApplication.run(DredomSpringbootRestApplication.class, args);
	}

    @Override
    public void run(String... arg) throws Exception {
        //Create the default tour packages
        tourPackageService.createTourPackage("BC", "Backpack Cal");
        tourPackageService.createTourPackage("CC", "California Calm");
        tourPackageService.createTourPackage("CH", "California Hot springs");
        tourPackageService.createTourPackage("CY", "Cycle California");
        tourPackageService.createTourPackage("DS", "From Desert to Sea");
        tourPackageService.createTourPackage("KC", "Kids California");
        tourPackageService.createTourPackage("NW", "Nature Watch");
        tourPackageService.createTourPackage("SC", "Snowboard Cali");
        tourPackageService.createTourPackage("TC", "Taste of California");
        tourPackageService.lookup().forEach(tourPackage -> System.out.println(tourPackage));
    }
}
