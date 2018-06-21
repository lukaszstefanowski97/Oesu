package com.example.demo;

import java.text.ParseException;
import java.util.LinkedList;
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
        System.out.println();
        Integer number = Property.enterInteger();

        if (number == 0) {
            System.out.println("Hope that everything had worked. Bye!\n");
            return 0;
        }

        if (number == 1) {
            for (Property listOfProperty : listOfProperties) {
                listOfProperty.printInformation();
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 2) {
            Property.addNewProperty();
            Integer number2 = Property.enterInteger();

            if (number2 == 0) {
                Flat.addFlat((LinkedList) listOfProperties);
            } else if (number2 == 1) {
                DetachedHouse.addDetachedHouse((LinkedList) listOfProperties);
            } else if (number2 == 2) {
                Studio.addStudio((LinkedList) listOfProperties);
            } else {
                System.out.println("There is no option under this number. Please type again.\n");
            }

            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 3) {
            for (Person listOfAgent : listOfAgents) {
                listOfAgent.printInformation();
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 4) {
            Agent.addAgent((LinkedList) listOfAgents);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 5) {
            for (Person listOfCleaner : listOfCleaners) {
                listOfCleaner.printInformation();
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 6) {
            Agent.addCleaner((LinkedList) listOfCleaners);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else {
            System.out.println("There is no option under this number. Please type again.\n");
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);
        }

        return 0;
    }
}
