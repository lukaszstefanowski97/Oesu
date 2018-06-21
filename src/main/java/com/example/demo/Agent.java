package com.example.demo;

/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

import java.util.Date;

public class Agent extends Person {

    private String name;
    private String surname;
    private Date dateOfBirth;
    private String idCardNumber;
    private Double salary;

    Agent(String newName, String newSurname, Date newDateOfBirth, String newIdCardNumber, Double newSalary) {
        this.name = newName;
        this.surname = newSurname;
        this.dateOfBirth = newDateOfBirth;
        this.idCardNumber = newIdCardNumber;
        this.salary = newSalary;
    }

    @Override
    public void printInformation() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(dateOfBirth);
        System.out.println(idCardNumber);
        System.out.println(salary);
    }

    @Override
    public void printSalary() {
        System.out.println(salary);
    }
}
