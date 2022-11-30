package com.group5.service;

import com.group5.model.HousingListing;
import com.group5.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BusinessLogicService {
    Optional<User> findUserById(Long id);
    Optional<HousingListing> createHouseListing(String street,
                                                int postNumber,
                                                String city,
                                                int houseNo,
                                                int constructionYear,
                                                int lastRebuilt,
                                                boolean hasInspection,
                                                double groundArea,
                                                double floorArea,
                                                List<String> imageBase64Data,
                                                List<String> imageContentType,
                                                List<String> imageFileName,
                                                double price);
}
