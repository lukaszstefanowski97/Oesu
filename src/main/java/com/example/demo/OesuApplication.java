package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class OesuApplication {

    public static void main(String[] args) throws ParseException {

        List<Property> listOfProperties = new LinkedList<>();
        List<Person> listOfAgents = new LinkedList<>();
        List<Person> listOfCleaners = new LinkedList<>();

        Menu.action(listOfProperties, listOfAgents, listOfCleaners);
    }
}
