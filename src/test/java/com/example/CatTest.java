package com.example;


import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void getSoundCatTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        List<String> actualEatMeat = cat.getFood();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    }

