package com.group5.model;

import java.util.List;

public class HouseListing {


    private final String street;
    private final int postNumber;
    private final String city;
    private final int houseNo;
    private final int constructionYear;
    private final int lastRebuilt;
    private final boolean hasInspection;
    private final double groundArea;
    private final double floorArea;
    private final List<String> imageBase64Data;
    private final List<String> imageContentType;
    private final List<String> imageFileName;
    private final double price;
    private final long id;

    private final String userEmail;



    public HouseListing(long id, String street, int postNumber, String city, int houseNo, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, List<String> imageBase64Data, List<String> imageContentType, List<String> imageFileName, double price, String userEmail) {
        this.id = id;
        this.street = street;
        this.postNumber = postNumber;
        this.city = city;
        this.houseNo = houseNo;
        this.constructionYear = constructionYear;
        this.lastRebuilt = lastRebuilt;
        this.hasInspection = hasInspection;
        this.groundArea = groundArea;
        this.floorArea = floorArea;
        this.imageBase64Data = imageBase64Data;
        this.imageContentType = imageContentType;
        this.imageFileName = imageFileName;
        this.price = price;
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getCity() {
        return city;
    }

    public int getHouseNo() {
        return houseNo;
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

    public List<String> getImageBase64Data() {
        return imageBase64Data;
    }

    public List<String> getImageContentType() {
        return imageContentType;
    }

    public List<String> getImageFileName() {
        return imageFileName;
    }

    public double getPrice() {
        return price;
    }


}
