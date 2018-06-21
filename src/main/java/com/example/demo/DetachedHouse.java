package com.example.demo;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

public class DetachedHouse extends Property {

    private String address;
    private String city;
    private Double area;
    private Integer roomNumber;
    private Double priceTotal;
    private Double rent;
    private Integer floorNumber;
    private Double gardenArea;
    private Boolean garage;

    DetachedHouse(String newAddress, String newCity, Double newArea, Integer newRoomNumber, Double newPriceTotal,
                  Double newRent, Integer newFloorNumber, Double newGardenArea, Boolean newGarage) {

        this.address = newAddress;
        this.city = newCity;
        this.area = newArea;
        this.roomNumber = newRoomNumber;
        this.priceTotal = newPriceTotal;
        this.rent = newRent;
        this.floorNumber = newFloorNumber;
        this.gardenArea = newGardenArea;
        this.garage = newGarage;
    }

    public static void addDetachedHouse(LinkedList listOfProperties) {
        listOfProperties.add(new Flat(Property.enterString(), Property.enterString(), Property.enterDouble(),
                Property.enterInteger(), Property.enterDouble(), Property.enterDouble()));
        System.out.println("Detached House is added");
    }

    @Override
    public void printInformation() {
        System.out.println(address);
        System.out.println(city);
        System.out.println(area);
        System.out.println(roomNumber);
        System.out.println(priceTotal);
        System.out.println(rent);
        System.out.println(floorNumber);
        System.out.println(gardenArea);
        System.out.println(garage);
    }
}
