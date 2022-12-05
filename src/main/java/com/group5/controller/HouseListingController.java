package com.group5.controller;

import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HousingListing;
import com.group5.service.implementations.HouseListingServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/houselisting")
public class HouseListingController {
    private HouseListingServiceImpl houseListingService;
    public HouseListingController(HouseListingServiceImpl houseListingService)
    {
        this.houseListingService=houseListingService;
    }

    @GetMapping("/{id}")
    public HousingListing getHouseListingById(@PathVariable("id") long id){
        return houseListingService.getHouseListingById(id);
    }

    @GetMapping("/")
    public ArrayList<HousingListing> getHousingListings(@PathParam("maxPrice")int maxPrice,
                                                        @PathParam("minArea")int minArea,
                                                        @PathParam("postNumber")int postNumber){
        return houseListingService.getHouseListings(maxPrice,minArea,postNumber);
    }
    
    @PostMapping("/")
    public HousingListing addHousingListing(@RequestBody HouseListingCreationDTO listing)
    {
        return houseListingService.addListing(listing);
    }
}
