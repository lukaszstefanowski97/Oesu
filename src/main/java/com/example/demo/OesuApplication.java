/**
 * Created by IntelliJ IDEA
 * User: Łukasz Stefanowski
 * Date: 20/06/2018
 */

package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.util.ArrayList;

@SpringBootApplication
public class OesuApplication {

    public static void main(String[] args) throws ParseException {

        Menu.printMenu();

        Integer number = Property.enterInteger();

        ArrayList<Property> listOfProperties = new ArrayList<>(20);
        ArrayList<Person> listOfAgents = new ArrayList<>(20);
        ArrayList<Person> listOfCleaners = new ArrayList<>(20);

        if (number == 0) System.exit(0);

        if (number == 1) System.out.println(listOfProperties);

        if (number == 2) {
            Property.addNewProperty();
            Integer number2 = Property.enterInteger();

            if (number2 == 0) {
                listOfProperties.add(new Flat(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble()));
            }

            if (number2 == 1) {
                listOfProperties.add(new DetachedHouse(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble(), Property.enterInteger(),
                        Property.enterDouble(), true));
            }

            if (number2 == 2) {
                listOfProperties.add(new Studio(Property.enterString(), Property.enterString(), Property.enterDouble(),
                        Property.enterInteger(), Property.enterDouble(), Property.enterDouble(), Property.enterInteger(),
                        true));
            }
        }

        if (number == 3) System.out.println(listOfAgents);

        if (number == 4) {
            listOfAgents.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                    .enterString(), Property.enterDouble()));
        }

        if (number == 5) System.out.println(listOfCleaners);

        if (number == 6) {
            listOfCleaners.add(new Agent(Property.enterString(), Property.enterString(), Person.enterDate(), Property
                    .enterString(), Property.enterDouble()));
        }
    }
}
