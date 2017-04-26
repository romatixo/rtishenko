package ru.job4j.stringpack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* CntrTest  класс теста слияния двух отсортированных массивов в один отсортированный.
* @author romatihsenko
* @since 25.04.2017
* @version 1
*/
public class CntrTest {
	/**
	* Тест слияния двух отсортированных массивов в один отсортированный.
	*/
    @Test
    public void when13And24Then1234() {
       Cntr control = new Cntr();
       int[] result = control.conc(new int[] {1, 3, 5}, new int[] {2, 4, 5, 7});
       int[] expected = new int[] {1, 2, 3, 4, 5, 5, 7};
       assertThat(result, is(expected));
    }
}