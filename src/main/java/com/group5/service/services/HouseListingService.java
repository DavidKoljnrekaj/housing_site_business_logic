package com.group5.service.services;

import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HousingListing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface HouseListingService {
    HousingListing getHouseListingById(long id);
    ArrayList<HousingListing> getHouseListings(int maxPrice, int minArea, int postNumber);
    HousingListing addListing(HouseListingCreationDTO listing);
}
