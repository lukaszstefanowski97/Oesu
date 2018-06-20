/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

package com.example.demo;

import java.util.Scanner;

public abstract class Property {

    public void printInformation(){}

    public static void addNewProperty(){
        System.out.println("[0] Add Flat");
        System.out.println("[1] Add Detached House");
        System.out.println("[2] Studio");
    }


    public static String enterString(){
        Scanner enterString = new Scanner(System.in);
        System.out.println("Enter string: ");
        String value = enterString.next();

        return value;
    }

    public static Double enterDouble(){
        Scanner enterDouble = new Scanner(System.in);
        System.out.println("Enter double: ");
        Double value = enterDouble.nextDouble();

        return value;
    }

    public static Integer enterInteger(){
        Scanner enterInteger = new Scanner(System.in);
        System.out.println("Enter integer: ");
        Integer value = enterInteger.nextInt();

        return value;
    }
}
