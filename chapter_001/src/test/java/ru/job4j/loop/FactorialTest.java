package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* FactorialTest класс теста факториала числа.
* @author romatihsenko
* @since 19.04.2017
* @version 1
*/
public class FactorialTest {
/**
* Тест факториала 0.
*/
@Test
    public void whenZeroThenOne() {
        Factorial fact = new Factorial();
        int  result = fact.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
/**
* Тест факториала 5.
*/
@Test
    public void whenFiveThenOneHundredTwenty() {
        Factorial fact = new Factorial();
        int  result = fact.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }
}