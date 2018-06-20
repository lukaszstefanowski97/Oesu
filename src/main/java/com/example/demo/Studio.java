package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

public class Studio extends Property {

    private String address;
    private String city;
    private Double area;
    private Integer roomNumber;
    private Double priceTotal;
    private Double rent;
    private Integer maxPerson;
    private Boolean media;

    Studio(String newAddress, String newCity, Double newArea, Integer newRoomNumber, Double newPriceTotal,
                  Double newRent, Integer newMaxPerson, Boolean newMedia) {

        this.address = newAddress;
        this.city = newCity;
        this.area = newArea;
        this.roomNumber = newRoomNumber;
        this.priceTotal = newPriceTotal;
        this.rent = newRent;
        this.maxPerson = newMaxPerson;
        this.media = newMedia;
    }

    @Override
    public void printInformation() {
        System.out.println(address);
        System.out.println(city);
        System.out.println(area);
        System.out.println(roomNumber);
        System.out.println(priceTotal);
        System.out.println(rent);
        System.out.println(maxPerson);
        System.out.println(media);
    }
}
