package com.example.demo;

import java.text.ParseException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

public class Menu {

    private static void printMenu() {
        System.out.println("[0] To close program");
        System.out.println("[1] Information about our properties");
        System.out.println("[2] Add new property");
        System.out.println("[3] Information about our agents");
        System.out.println("[4] Add new agent");
        System.out.println("[5] Information about our cleaners");
        System.out.println("[6] Add new cleaner");
    }

    public static Integer action(List<Property> listOfProperties, List<Person> listOfAgents,
                                 List<Person> listOfCleaners) throws ParseException {
        Menu.printMenu();
        Integer number = Property.enterInteger();

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            for (int i = 0; i < listOfProperties.size(); i++) {
                listOfProperties.get(i).printInformation();
                Menu.action(listOfProperties, listOfAgents, listOfCleaners);
            }
        }

        if (number == 2) {
            Property.addNewProperty();
            Integer number2 = Property.enterInteger();

            if (number2 == 0) {
                listOfProperties.add(new Flat(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble()));
                System.out.println("Flat is added");
            }

            if (number2 == 1) {
                listOfProperties.add(new DetachedHouse(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble(), Property.enterInteger(),
                        Property.enterDouble(), true));
                System.out.println("Detached House is added");
            }

            if (number2 == 2) {
                listOfProperties.add(new Studio(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble(), Property.enterInteger(),
                        true));
                System.out.println("Studio is added");
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);
        }

        if (number == 3) {
            for (int i = 0; i < listOfAgents.size(); i++) {
                listOfAgents.get(i).printInformation();
                Menu.action(listOfProperties, listOfAgents, listOfCleaners);
            }
        }

        if (number == 4) {
            listOfAgents.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                    .enterString(), Property.enterDouble()));
            System.out.println("Agent is added");
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);
        }

        if (number == 5) {
            for (int i = 0; i < listOfCleaners.size(); i++) {
                listOfCleaners.get(i).printInformation();
                Menu.action(listOfProperties, listOfAgents, listOfCleaners);
            }
        }

        if (number == 6) {
            listOfCleaners.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                    .enterString(), Property.enterDouble()));
            System.out.println("Cleaner is added");
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);
        }

        return 0;
    }
}
