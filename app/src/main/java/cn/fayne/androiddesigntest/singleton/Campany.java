package cn.fayne.androiddesigntest.singleton;

import java.util.ArrayList;
import java.util.List;

public class Campany {

    private List<Person> allPersons = new ArrayList<Person>();

    public void addStaff(Person person) {
        allPersons.add(person);
    }

    public void showAllStaff() {
        for (Person person: allPersons) {
            System.out.println("Obj: " + person.toString());
        }
    }
}
