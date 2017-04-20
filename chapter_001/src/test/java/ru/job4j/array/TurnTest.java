package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* TestTest класс теста разворота массива.
* @author romatihsenko
* @since 20.04.2017
* @version 1
*/
public class TurnTest {
/**
* Тест четного массива.
*/
@Test
    public void whenThreeThenThinks() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3, 4};
        int[] result = turn.back(array);
        int[] expected = new int[] {4, 3, 2, 1};
        assertThat(result, is(expected));
    }
/**
* Тест нечетного массива.
*/
@Test
    public void whenThreeThenThinks1() {
        Turn turn = new Turn();
        int[] array = new int[] {1, 2, 3};
        int[] result = turn.back(array);
        int[] expected = new int[] {3, 2, 1};
        assertThat(result, is(expected));
    }
}