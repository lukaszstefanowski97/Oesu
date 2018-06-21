package com.example.demo;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

public class Flat extends Property {

    private String address;
    private String city;
    private Double area;
    private Integer roomNumber;
    private Double priceTotal;
    private Double rent;

    Flat(String newAddress, String newCity, Double newArea, Integer newRoomNumber, Double newPriceTotal,
         Double newRent) {

        this.address = newAddress;
        this.city = newCity;
        this.area = newArea;
        this.roomNumber = newRoomNumber;
        this.priceTotal = newPriceTotal;
        this.rent = newRent;
    }

    public static void addFlat(LinkedList listOfProperties) {
        listOfProperties.add(new Flat(Property.enterString(), Property.enterString(), Property.enterDouble(),
                Property.enterInteger(), Property.enterDouble(), Property.enterDouble()));
        System.out.println("Flat is added\n");
    }

    @Override
    public void printInformation() {
        System.out.println(address + "\n" + city + "\n" + area + "\n" + roomNumber + "\n" + priceTotal + "\n" + rent + "\n");
    }
}
