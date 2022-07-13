package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PetTest {
    Pet pet;

    @Before
    public void init() {
        pet = new Pet();
    }
    @Test
    public void getName() {
        String exp = "Pet";

        String actual = pet.getName();

        assertEquals(exp, actual);
    }

    @Test
    public void setName() {
        String exp = "ExpName";

        pet.setName(exp);
        String actual = pet.getName();

        assertEquals(exp, actual);
    }

    @Test
    public void testCompare() {
        Pet[] pets = new Pet[3];
        Pet dog = new Dog("A0");
        for (int i = 0; i < pets.length - 1; i++) {
            pets[i] = new Pet("A" + (i + 1));
        }
        pets[2] = dog;

        String expectedAfterSort = "A0";
        Arrays.sort(pets);
        String actualAfterSort = pets[2].getName();

        Assert.assertEquals(expectedAfterSort, actualAfterSort);

    }
}
