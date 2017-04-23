package ru.job4j.stringpack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* StringTaskTest  класс теста поиска подстроки в строке.
* @author romatihsenko
* @since 23.04.2017
* @version 1
*/
public class StringTaskTest  {
	/**
	* Тест поиска подстроки в строке.
	*/
    @Test
    public void whenABCAndBThenTrue() {
       StringTask str = new StringTask();
       String origin = "strokaandpodstroka";
	   String sub = "podstroka";
       boolean result = str.contains(origin, sub);
       boolean expected = true;
       assertThat(result, is(expected));
    }
	/**
	* Тест поиска подстроки в строке.
	*/
    @Test
    public void whenABCAndGThenFalse() {
       StringTask str = new StringTask();
       String origin = "strokaandpodstroka";
	   String sub = "rora";
       boolean result = str.contains(origin, sub);
       boolean expected = false;
       assertThat(result, is(expected));
    }
}