package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import java.util.Scanner;

public abstract class Property {

    public void printInformation() {
    }

    public static void addNewProperty() {
        System.out.println("[0] Add Flat");
        System.out.println("[1] Add Detached House");
        System.out.println("[2] Studio");
        System.out.println();
    }


    public static String enterString() {
        try {
            Scanner enterString = new Scanner(System.in);
            System.out.println("Enter string: ");
            String value = enterString.next();
            System.out.println();
            return value;
        } catch (Exception type) {
            System.out.println("That was not a string. Please type again:\n");
            return enterString();
        }
    }

    public static Double enterDouble() {
        try {
            Scanner enterDouble = new Scanner(System.in);
            System.out.println("Enter double: ");
            Double value = enterDouble.nextDouble();
            System.out.println();
            return value;
        } catch (Exception type) {
            System.out.println("That was not a double. Please type again:\n");
            return enterDouble();
        }
    }

    public static Integer enterInteger() {
        try {
            Scanner enterInteger = new Scanner(System.in);
            System.out.println("Enter integer: ");
            Integer value = enterInteger.nextInt();
            System.out.println();
            return value;
        } catch (Exception type) {
            System.out.println("That was not an integer. Please type again:\n");
            return enterInteger();
        }
    }
}
