package com.example;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
      Lion lion = new Lion("Самец", feline);
      int actualKittensCount = 0;
      int expectedKittensCount = lion.getKittens();
      assertEquals(actualKittensCount, expectedKittensCount);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHaveMane = lion.doesHaveMane();
        boolean expectedHaveMane = true;
        assertEquals(actualHaveMane, expectedHaveMane);
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);

    }

}
