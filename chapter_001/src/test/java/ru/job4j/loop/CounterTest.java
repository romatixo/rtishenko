package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* CounterTest класс теста суммы четных чисел.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class CounterTest {
/**
* Тест подсчёта суммы четных чиел от 1 до 10.
*/
@Test
    public void whenOneAndTenThenThirteen() {
        Counter count = new Counter();
        int  result = count.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }
}