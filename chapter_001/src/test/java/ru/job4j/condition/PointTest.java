package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* PointTest класс теста макс.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class PointTest {
/**
* Тест проверки нахождения на функции.
*/
 @Test
    public void whenOneAndOneThenTwo() {
       	Point point = new Point(1, 2);
       	boolean result = point.is(1, 1);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}