package com.group5.service.implementations;
import com.group5.database.DatabaseServerConn;
import com.group5.model.HouseListingCreationDTO;
import com.group5.model.HousingListing;
import com.group5.proto.Listing.CreateHouseListingRequest;
import com.group5.proto.Listing.HouseResponse;
import com.group5.proto.Listing.IdRequest;
import com.group5.proto.Listing.ListingServiceGrpc;
import com.group5.service.services.HouseListingService;
import io.grpc.StatusRuntimeException;
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
        HouseResponse response = null;
        try{
            response = blockingStub.getListingById(IdRequest.newBuilder().setId(id).build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HousingListing(response.getId(), response.getStreet(), response.getPostNumber(), response.getCity(), response.getHouseNo(), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(), response.getFloorArea(), response.getImageBase64DataList(), response.getImageContentTypeList(), response.getImageFileNameList(), response.getPrice());
    }

    @Override
    public ArrayList<HousingListing> getHouseListings(int maxPrice, int minArea, int postNumber) {
        return null;
    }

    @Override
    public HousingListing addListing(HouseListingCreationDTO listing) {
        HouseResponse response = null;
        try {
            response = blockingStub.createListing(CreateHouseListingRequest.newBuilder()
                    .setStreet(listing.getAddress().street)
                    .setPostNumber(listing.getAddress().postNumber)
                    .setCity(listing.getAddress().city).setHouseNo(listing.getAddress().houseNo)
                    .setConstructionYear(listing.getConstructionYear())
                    .setLastRebuilt(listing.getLastRebuilt())
                    .setHasInspection(listing.isHasInspection())
                    .setGroundArea(listing.getGroundArea())
                    .setFloorArea(listing.getFloorArea())
                    .addAllImageBase64Data(listing.getAllBase64())
                    .addAllImageContentType(listing.getAllContentType())
                    .addAllImageFileName(listing.getAllFileName())
                    .setPrice(listing.getPrice())
                    .build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HousingListing(response.getId(), response.getStreet(), response.getPostNumber(), response.getCity(), response.getHouseNo(), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(), response.getFloorArea(), response.getImageBase64DataList(), response.getImageContentTypeList(), response.getImageFileNameList(), response.getPrice());

    }
}
