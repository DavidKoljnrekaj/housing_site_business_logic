package com.group5.service.implementations;
import com.group5.database.DatabaseServerConn;
import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HousingListing;
import com.group5.proto.Listing.ListingServiceGrpc;
import com.group5.service.services.HouseListingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HouseListingServiceImpl implements HouseListingService {
    ListingServiceGrpc.ListingServiceBlockingStub blockingStub;
    ListingServiceGrpc.ListingServiceStub stub;

    public HouseListingServiceImpl() {
        blockingStub=DatabaseServerConn.getListingBlockingStub();
        stub=DatabaseServerConn.getListingStub();
    }

    @Override
    public HousingListing getHouseListingById(long id) {
        return null;
    }

    @Override
    public ArrayList<HousingListing> getHouseListings(int maxPrice, int minArea, int postNumber) {
        return null;
    }

    @Override
    public HousingListing addListing(HouseListingCreationDTO listing) {
        /*CreateHouseListingResponse response = null;
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
    */
        return null;
    }
}
