/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

package com.example.demo;

import java.text.DateFormat;
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
        String dateString = enterDate.next();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(dateString);
        return date;
    }
}
