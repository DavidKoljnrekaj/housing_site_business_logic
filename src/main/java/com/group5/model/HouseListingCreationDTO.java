package com.group5.model;

import java.util.ArrayList;
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

    public HouseListingCreationDTO(Address address, int constructionYear, int lastRebuilt, boolean hasInspection, double groundArea, double floorArea, List<ImageFile> images, long price)
    {
        this.address = address;
        this.constructionYear = constructionYear;
        this.lastRebuilt = lastRebuilt;
        this.hasInspection = hasInspection;
        this.groundArea = groundArea;
        this.floorArea = floorArea;
        this.images = images;
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public int getLastRebuilt() {
        return lastRebuilt;
    }

    public void setLastRebuilt(int lastRebuilt) {
        this.lastRebuilt = lastRebuilt;
    }

    public boolean isHasInspection() {
        return hasInspection;
    }

    public void setHasInspection(boolean hasInspection) {
        this.hasInspection = hasInspection;
    }

    public double getGroundArea() {
        return groundArea;
    }

    public void setGroundArea(double groundArea) {
        this.groundArea = groundArea;
    }

    public double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(double floorArea) {
        this.floorArea = floorArea;
    }

    public List<ImageFile> getImages() {
        return images;
    }

    public void setImages(List<ImageFile> images) {
        this.images = images;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public List<String> getAllBase64()
    {
        List<String> base=new ArrayList<>();
        for (ImageFile image:images) {
            base.add(image.getBase64Data());
        }
        return base;
    }
    public List<String> getAllFileName()
    {
        List<String> file=new ArrayList<>();
        for (ImageFile image:images) {
            file.add(image.getFileName());
        }
        return file;
    }
    public List<String> getAllContentType()
    {
        List<String> content=new ArrayList<>();
        for (ImageFile image:images) {
            content.add(image.getContentType());
        }
        return content;
    }

}
