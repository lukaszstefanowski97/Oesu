package com.example.demo;

import java.util.Scanner;

public class Flat extends Property {

    private String address;
    private String city;
    private Double area;
    private Integer roomNumber;
    private Double priceTotal;
    private Double rent;

    Flat(String newAddress, String newCity, Double newArea, Integer newRoomNumber, Double newPriceTotal,
         Double newRent){

        this.address = newAddress;
        this.city = newCity;
        this.area = newArea;
        this.roomNumber = newRoomNumber;
        this.priceTotal = newPriceTotal;
        this.rent = newRent;
    }

    @Override
    public void printInformation() {
        System.out.println(address);
        System.out.println(city);
        System.out.println(area);
        System.out.println(roomNumber);
        System.out.println(priceTotal);
        System.out.println(rent);
    }
}
