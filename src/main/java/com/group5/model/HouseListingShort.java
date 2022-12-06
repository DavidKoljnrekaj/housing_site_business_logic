package com.group5.model;

public class HouseListingShort {
    private Long id;
    private ImageFile image;
    private Address address;
    private long price;

    public HouseListingShort(Long id, ImageFile image, Address address, long price) {
        this.id = id;
        this.image = image;
        this.address = address;
        this.price=price;
    }
    public HouseListingShort(HouseListing listing, ImageFile image) {
        this.id = listing.getId();
        this.image = image;
        this.address = new Address(listing.getStreet(), listing.getPostNumber(), listing.getCity(), listing.getHouseNo());
    }

    public Address getAddress() {
        return address;
    }

    public ImageFile getImage() {
        return image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setImage(ImageFile image) {
        this.image = image;
    }

}
