package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person {

    public void printInformation() {
    }

    public static Date enterDate() {
        Scanner enterDate = new Scanner(System.in);
        System.out.println("Enter date (dd/mm/yyyy: ");
        try {
            String dateString = enterDate.next();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatter.parse(dateString);
            System.out.println();
            return date;
        } catch (Exception type) {
            System.out.println("That was not a date in dd/MM/yyyy format. Please type again:\n");
            return enterDate();
        }
    }
}
