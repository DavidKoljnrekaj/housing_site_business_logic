package com.group5.model;

import java.util.List;

public class HouseListingCreationDTO {
    private Address address;
    private int constructionYear;
    private int lastRebuilt;
    private boolean hasInspection;
    private double groundArea;
    private double floorArea;
    private List<ImageFile> images;
    private long price;

    public HouseListingCreationDTO(Address adress, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, List<ImageFile> images, long price)
    {
        this.address = adress;
        this.constructionYear = constructionYear;
        this.lastRebuilt = lastRebuilt;
        this.hasInspection = hasInspection;
        this.groundArea = groundArea;
        this.floorArea = floorArea;
        this.images = images;
        this.price = price;
    }
}
