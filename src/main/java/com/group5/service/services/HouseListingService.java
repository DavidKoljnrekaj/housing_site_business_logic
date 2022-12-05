package com.group5.service.services;

import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HouseListing;
import com.group5.model.HouseListingShort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface HouseListingService {
    HouseListing getHouseListingById(long id);
    ArrayList<HouseListingShort> getHouseListings(Optional<Integer> maxPrice, Optional<Integer> minArea, Optional<Integer> postNumber);
    HouseListing addListing(HouseListingCreationDTO listing);
}
