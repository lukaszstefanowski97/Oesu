package com.example.demo;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

public class Menu {

    private static void printMenu() {
        System.out.println("[0] To close program\n[1] Information about our properties\n[2] Add new property\n[3] " +
                "Remove property\n[4] Information about our agents\n[5] Add new agent\n[6] Remove agent\n[7] " +
                "Information about our cleaners\n[8] Add new cleaner\n[9] Remove cleaner\n[10] Clear all");
    }

    public static Integer action(LinkedList<Property> listOfProperties, LinkedList<Person> listOfAgents,
                                 LinkedList<Person> listOfCleaners) {
        Menu.printMenu();
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
                Flat.addFlat(listOfProperties);
            } else if (number2 == 1) {
                DetachedHouse.addDetachedHouse(listOfProperties);
            } else if (number2 == 2) {
                Studio.addStudio(listOfProperties);
            } else {
                System.out.println("There is no option under this number. Please type again:\n");
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 3) {
            Agent.removeItem(listOfProperties);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 4) {
            for (Person listOfAgent : listOfAgents) {
                listOfAgent.printInformation();
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 5) {
            Agent.addAgent(listOfAgents);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 6) {
            Agent.removeItem(listOfAgents);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 7) {
            for (Person listOfCleaner : listOfCleaners) {
                listOfCleaner.printInformation();
            }
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 8) {
            Agent.addCleaner(listOfCleaners);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 9) {
            Agent.removeItem(listOfCleaners);
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else if (number == 10) {
            listOfAgents.clear();
            listOfCleaners.clear();
            listOfProperties.clear();
            System.out.println("All lists are cleared.\n");
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);

        } else {
            System.out.println("There is no option under this number. Please type again:\n");
            Menu.action(listOfProperties, listOfAgents, listOfCleaners);
        }

        return 0;
    }
}
