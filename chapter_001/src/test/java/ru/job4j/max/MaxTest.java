package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* MaxTest класс теста макс.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class MaxTest {
/**
* Тест выбора максимума двух чисел.
*/
 @Test
    public void whenAddOnePlusOneThenTwo() {
       Max max = new Max();
        int  result = max.max(1, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }
/**
* Тест выбора максимума трех чисел.
*/
 @Test
    public void whenAddOnePlusOnePlusOneThenTwo() {
       Max max = new Max();
        int  result = max.max(1, 2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }
}