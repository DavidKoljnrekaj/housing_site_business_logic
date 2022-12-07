package com.group5.model;

import java.util.ArrayList;
import java.util.List;

public class HouseListingCreationDTO {
    private Address address;
    private int ConstructionYear;
    private int LastRebuilt;
    private boolean HasInspection;
    private double GroundArea;
    private double FloorArea;
    private List<ImageFile> images;
    private long price;

    public HouseListingCreationDTO(Address address, int ConstructionYear, int LastRebuilt, boolean HasInspection, double GroundArea, double FloorArea, List<ImageFile> images, long price)
    {
        this.address = address;
        this.ConstructionYear = ConstructionYear;
        this.LastRebuilt = LastRebuilt;
        this.HasInspection = HasInspection;
        this.GroundArea = GroundArea;
        this.FloorArea = FloorArea;
        this.images = images;
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getConstructionyear() {
        return ConstructionYear;
    }

    public void setConstructionyear(int constructionyear) {
        this.ConstructionYear = constructionyear;
    }

    public int getLastrebuilt() {
        return LastRebuilt;
    }

    public void setLastrebuilt(int lastrebuilt) {
        this.LastRebuilt = lastrebuilt;
    }

    public boolean isHasinspection() {
        return HasInspection;
    }

    public void setHasinspection(boolean hasinspection) {
        this.HasInspection = hasinspection;
    }

    public double getGroundarea() {
        return GroundArea;
    }

    public void setGroundarea(double groundarea) {
        this.GroundArea = groundarea;
    }

    public double getFloorarea() {
        return FloorArea;
    }

    public void setFloorarea(double floorarea) {
        this.FloorArea = floorarea;
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
            base.add(image.getBase64data());
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
