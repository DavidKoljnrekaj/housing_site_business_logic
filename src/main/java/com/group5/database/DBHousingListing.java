package com.group5.database;

import com.group5.proto.*;
import com.group5.model.HousingListing;
import io.grpc.StatusRuntimeException;

import java.util.List;

public class DBHousingListing {

    public HousingListing createHouseListing(String street, int postNumber, String city, int houseNo, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, List<String> imageBase64Data, List<String> imageContentType, List<String> imageFileName, double price){
        ListingServiceGrpc.ListingServiceBlockingStub stub1 = DatabaseServerConnection.getStub1();
        CreateHouseListingResponse response = null;
        try {
            response = stub1.createListing(CreateHouseListingRequest.newBuilder()
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
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
        }
        return new HousingListing(response.getId(), response.getStreet(), response.getPostNumber(), response.getCity(), response.getHouseNo(), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(), response.getFloorArea(), response.getImageBase64DataList(), response.getImageContentTypeList(), response.getImageFileNameList(), response.getPrice());
    }


}
