package com.group5.model;

public class Address {
    public String street;
    public int postNumber;
    public String city;
    public int houseNo;

    public Address(String street, int postNumber, String city, int houseNo)
    {
        this.street = street;
        this.postNumber = postNumber;
        this.city = city;
        this.houseNo = houseNo;
    }
}
