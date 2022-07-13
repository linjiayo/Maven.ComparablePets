package io.zipcoder;

public class Dog extends Pet{

    public Dog() {
        super();
    }

    public Dog(String name) {
        super.name = name;
    }
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
