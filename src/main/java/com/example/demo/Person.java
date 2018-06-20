package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person {

    public void printInformations(){}

    public void printSalary(){}

    public static Date enterDate() throws ParseException {
        Scanner enterDate = new Scanner(System.in);
        System.out.println("Enter date (dd/mm/yyyy: ");
        Date value = new SimpleDateFormat("dd/MM/yyyy").parse(enterDate.toString());

        return value;
    }
}
