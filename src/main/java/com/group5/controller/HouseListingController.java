package com.group5.controller;

import com.group5.model.HousingListing;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HouseListingController {
    private ArrayList<HousingListing> housingListings = new ArrayList<HousingListing>();
    List<String> dummyStringList = Arrays.asList("Sup1", "Sup2", "Sup3");
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/houseListing/{id}")
    public HousingListing getGreetingById(@PathVariable("id") int id){
        return housingListings.get(id-1);
    }

    @GetMapping("/housingListings")
    public ArrayList<HousingListing> getHousingListings(){
        return housingListings;
    }
    
    @PostMapping("/addHousingListing")
    public String addHousingListing(@RequestParam(value = "street", defaultValue = "Null") String street){
        housingListings.add(new HousingListing(counter.incrementAndGet() , String.format(street), 0, "None", 0, 0, 0, false, 0 , 0, dummyStringList, dummyStringList, dummyStringList, 0 ));
        return "Listing added!";
    }
}
