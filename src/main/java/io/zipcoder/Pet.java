package io.zipcoder;

import java.util.Comparator;

public class Pet implements Comparable<Pet>, Comparator<Pet> {
    String name;

    public Pet() {
        name = "Pet";
    }

    public Pet(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet pet) {
        return pet.name.compareTo(this.name);
    }

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet2.compareTo(pet1);
    }
}
