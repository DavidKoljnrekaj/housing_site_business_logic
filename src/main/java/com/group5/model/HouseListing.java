package com.group5.model;

import java.util.List;

public class HouseListing {


    private Address address;
    private final int constructionYear;
    private final int lastRebuilt;
    private final boolean hasInspection;
    private final double groundArea;
    private final double floorArea;
    private List<ImageFile> images;
    private final double price;
    private final long id;

    private final String userEmail;

    private String description;

    public HouseListing(long id, Address address, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea,
                        double floorArea, List<ImageFile> images, double price, String userEmail,String description) {
        this.id = id;
        this.address=address;
        this.constructionYear = constructionYear;
        this.lastRebuilt = lastRebuilt;
        this.hasInspection = hasInspection;
        this.groundArea = groundArea;
        this.floorArea = floorArea;
        this.images=images;
        this.price = price;
        this.userEmail = userEmail;
        this.description=description;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public int getLastRebuilt() {
        return lastRebuilt;
    }

    public boolean isHasInspection() {
        return hasInspection;
    }

    public double getGroundArea() {
        return groundArea;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public List<ImageFile> getImages() {
        return images;
    }

    public double getPrice() {
        return price;
    }


}
