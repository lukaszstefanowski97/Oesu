package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import java.util.Date;
import java.util.LinkedList;

public class Agent extends Person {

    private String name;
    private String surname;
    private Date dateOfBirth;
    private String idCardNumber;
    private Double salary;

    private Agent(String newName, String newSurname, Date newDateOfBirth, String newIdCardNumber, Double newSalary) {
        this.name = newName;
        this.surname = newSurname;
        this.dateOfBirth = newDateOfBirth;
        this.idCardNumber = newIdCardNumber;
        this.salary = newSalary;
    }

    public static void addAgent(LinkedList listOfAgents) {
        listOfAgents.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                .enterString(), Property.enterDouble()));
        System.out.println("Agent is added\n");
    }

    public static void removeItem(LinkedList listOfAgents) {
        System.out.println("Please type an index of and item you want to remove: ");
        int index = Property.enterInteger();
        if (index == listOfAgents.size()) {
            Integer maxIndex = listOfAgents.size()-1;
            System.out.println("The maximum index equals to " + maxIndex);
            removeItem(listOfAgents);
        } else if (index < 0) {
            System.out.println("Index can not be negative.\n");
            removeItem(listOfAgents);
        } else {
            listOfAgents.remove(index);
            System.out.println("Item is removed.\n");
        }
    }

    public static void addCleaner(LinkedList listOfCleaners) {
        listOfCleaners.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                .enterString(), Property.enterDouble()));
        System.out.println("Cleaner is added\n");
    }

    @Override
    public void printInformation() {
        System.out.println(name + "\n" + surname + "\n" + dateOfBirth + "\n" + idCardNumber + "\n" + salary + "\n");
    }
}
