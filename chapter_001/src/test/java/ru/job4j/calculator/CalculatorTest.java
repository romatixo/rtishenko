package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* CalculatorTest класс теста каолькулятора.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class CalculatorTest {
/**
* Тест сложения двух чисел.
*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

/**
* Тест сложения двух чисел.
*/
    @Test
    public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.substruct(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

/**
* Тест сложения двух чисел.
*/
    @Test
    public void whenAddOneDivOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(2D, 2D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

/**
* Тест сложения двух чисел.
*/
    @Test
    public void whenAddOneMultOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}