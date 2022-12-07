package com.group5.service.implementations;
import com.group5.database.DatabaseServerConn;
import com.group5.model.*;
import com.group5.proto.Listing.*;
import com.group5.service.services.HouseListingService;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

@Service
public class HouseListingServiceImpl implements HouseListingService {
    ListingServiceGrpc.ListingServiceBlockingStub blockingStub;
    ListingServiceGrpc.ListingServiceStub stub;

    public HouseListingServiceImpl() {
        blockingStub=DatabaseServerConn.getListingBlockingStub();
        stub=DatabaseServerConn.getListingStub();
    }

    @Override
    public HouseListing getHouseListingById(long id) {
        HouseResponse response = null;
        try{
            response = blockingStub.getListingById(IdRequest.newBuilder().setId(id).build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HouseListing(response.getId(),new Address(response.getAddress().getStreet(), response.getAddress().getPostNumber(), response.getAddress().getCity(),
                response.getAddress().getHouseNo()), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(),
                response.getFloorArea(), ImageFile.fromGrpc(response.getImagesList()), response.getPrice(), response.getUserEmail(), response.getDescription());
    }

    @Override
    public ArrayList<HouseListingShort> getHouseListings(Optional<Integer> maxPrice, Optional<Integer> minArea, Optional<Integer> postNumber) {
        ListingFiltersRequest.Builder builder=ListingFiltersRequest.newBuilder();
        ArrayList<HouseListingShort> listingShorts=new ArrayList<>();
        {
            if(maxPrice.isPresent())
            {
                builder.setMaxPrice(maxPrice.get().longValue());
            } else if (minArea.isPresent()) {
                builder.setMinArea(minArea.get().longValue());
            } else if (postNumber.isPresent()) {
                builder.setPostNumber(postNumber.get().longValue());
            }
            ListingFiltersRequest request=builder.build();

            Iterator<ShortListingResponse> response;

            response = blockingStub.getFilteredListings(request);
            while(response.hasNext()) {
                ShortListingResponse listing = response.next();
                listingShorts.add(new HouseListingShort(listing.getId(),
                        new ImageFile(listing.getImage().getImageBase64Data(), listing.getImage().getImageFileName(),listing.getImage().getImageContentType()),
                        new Address(listing.getAddress().getStreet(), listing.getAddress().getPostNumber(), listing.getAddress().getCity(),
                                listing.getAddress().getHouseNo()),
                        listing.getPrice()));
            }
            return listingShorts;
        }
    }

    @Override
    public HouseListing addListing(HouseListingCreationDTO listing) {
        HouseResponse response = null;
        try {
            response = blockingStub.createListing(CreateHouseListingRequest.newBuilder()
                    .setConstructionYear(listing.getConstructionyear())
                    .setLastRebuilt(listing.getLastrebuilt())
                    .setHasInspection(listing.isHasinspection())
                    .setGroundArea(listing.getGroundarea())
                    .setFloorArea(listing.getFloorarea())
                    .setAddress(AddressMessage.newBuilder().setStreet(listing.getAddress().getStreet()).setHouseNo(listing.getAddress().houseno)
                            .setCity(listing.getAddress().city).setPostNumber(listing.getAddress().postnumber).build())
                            .addAllImages(listing.getAllImageFileMessages(listing.getImages()))
                    .setPrice((double)listing.getPrice())
                    .setUserEmail("the email will be here")
                    .build());
        }
        catch (StatusRuntimeException e){
            System.out.println("Listing not created");
            e.printStackTrace();
            return null;
        }
        return new HouseListing(response.getId(),new Address(response.getAddress().getStreet(), response.getAddress().getPostNumber(), response.getAddress().getCity(),
                response.getAddress().getHouseNo()), response.getConstructionYear(), response.getLastRebuilt(), response.getHasInspection(), response.getGroundArea(),
                response.getFloorArea(), ImageFile.fromGrpc(response.getImagesList()), response.getPrice(), response.getUserEmail(), response.getDescription());
    }
}
