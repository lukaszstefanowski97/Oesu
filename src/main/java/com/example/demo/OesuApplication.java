package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class OesuApplication {

    public static void main(String[] args) {

        LinkedList<Property> listOfProperties = new LinkedList<>();
        LinkedList<Person> listOfAgents = new LinkedList<>();
        LinkedList<Person> listOfCleaners = new LinkedList<>();

        Menu.action(listOfProperties, listOfAgents, listOfCleaners);
    }
}
