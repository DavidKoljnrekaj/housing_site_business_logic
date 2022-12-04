package com.group5.controller;

import com.group5.model.HousingListing;
import com.group5.service.implementations.HouseListingServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/HouseListings")
public class HouseListingController {
    private HouseListingServiceImpl houseListingService;
    public HouseListingController(HouseListingServiceImpl houseListingService)
    {
        this.houseListingService=houseListingService;
    }

    @GetMapping("/houseListing/{id}")
    public HousingListing getGreetingById(@PathVariable("id") int id){

    }

    @GetMapping("/housingListings")
    public ArrayList<HousingListing> getHousingListings(){

    }
    
    @PostMapping("/addHousingListing")
    public HousingListing addHousingListing(
    }
}
