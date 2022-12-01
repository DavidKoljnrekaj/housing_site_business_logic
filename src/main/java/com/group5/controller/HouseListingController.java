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
    public HousingListing addHousingListing(@RequestParam(value = "street", defaultValue = "Null") String street,
                                            @RequestParam(value = "postNumber", defaultValue = "0") int postNumber,
                                            @RequestParam(value = "city", defaultValue = "Null") String city,
                                            @RequestParam(value = "houseNo", defaultValue = "0") int houseNo,
                                            @RequestParam(value = "constructionYear", defaultValue = "0") int constructionYear,
                                            @RequestParam(value = "lastRebuilt", defaultValue = "0") int lastRebuilt,
                                            @RequestParam(value = "hasInspection", defaultValue = "false") boolean hasInspection,
                                            @RequestParam(value = "groundArea", defaultValue = "0") double groundArea,
                                            @RequestParam(value = "floorArea", defaultValue = "0") double floorArea,
                                            @RequestParam(value = "imageBase64Data", defaultValue =  "Null") List<String> imageBase64Data,
                                            @RequestParam(value = "imageContentType", defaultValue =  "Null") List<String> imageContentType,
                                            @RequestParam(value = "imageFileName", defaultValue =  "Null") List<String> imageFileName,
                                            @RequestParam(value = "price", defaultValue = "0") double price){
        housingListings.add(new HousingListing(counter.incrementAndGet() , String.format(street), postNumber, String.format(city), houseNo, constructionYear, lastRebuilt, hasInspection, groundArea , floorArea, imageBase64Data, imageContentType, imageFileName, price ));
        //System.out.println(housingListings.get(counter.intValue() - 1));
        return housingListings.get(counter.intValue() - 1);
    }
}
