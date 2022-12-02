package com.group5.service;

import com.group5.database.DatabaseServerConnection;
import com.group5.model.HousingListing;
import com.group5.model.User;
import com.group5.proto.*;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    private UserServiceGrpc.UserServiceBlockingStub stub;
    private ListingServiceGrpc.ListingServiceBlockingStub stub1;

    public BusinessLogicServiceImpl()
    {
        stub=DatabaseServerConnection.getStub();
        stub1=DatabaseServerConnection.getStub1();
    }
    public Optional<User> findUserById(Long id)
    {
        GetUserByIdResponse response=stub.getUserById(GetUserByIdRequest.newBuilder()
                        .setUserId(id)
                .build());
        User user = new User(id, response.getName(), response.getSurname(),response.getEmail());
        Optional<User>user1=Optional.of(user);
        return user1;
    }

    @Override
    public Optional<HousingListing> createHouseListing(String street, int postNumber, String city, int houseNo, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, List<String> imageBase64Data, List<String> imageContentType, List<String> imageFileName, double price) {

        CreateHouseListingResponse response = stub1.createListing(CreateHouseListingRequest.newBuilder()
                .setStreet(street)
                .setPostNumber(postNumber)
                .setCity(city).setHouseNo(houseNo)
                .setConstructionYear(constructionYear)
                .setLastRebuilt(lastRebuilt)
                .setHasInspection(hasInspection)
                .setGroundArea(groundArea)
                .setFloorArea(floorArea)
                .addAllImageBase64Data(imageBase64Data)
                .addAllImageContentType(imageBase64Data)
                .addAllImageFileName(imageFileName)
                .setPrice(price)
                .build());
        HousingListing housingListing = new HousingListing(response.getId(), response.getStreet(), response.getPostNumber(), response.getCity(), response.getHouseNo(), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(), response.getFloorArea(), response.getImageBase64DataList(), response.getImageContentTypeList(), response.getImageFileNameList(), response.getPrice());
        Optional<HousingListing> housingListing1 = Optional.of(housingListing);
        return housingListing1;
    }


}
