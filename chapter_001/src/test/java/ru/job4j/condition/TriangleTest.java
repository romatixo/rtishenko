package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;
import static org.junit.Assert.assertThat;
/**
* TriangleTest класс теста макс.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class TriangleTest {
/**
* Тест проверки площади треугольника.
*/
 @Test
    public void whenOneAndOneThenTwo() {
       	Point a = new Point(0, 0);
       	Point b = new Point(3, 0);
       	Point c = new Point(0, 4);
        Triangle tr = new Triangle(a, b, c);
        double res = tr.area();
        double expected = 6.0;
        assertThat(res, closeTo(expected, 0.1));
    }
    /**
* Тест проверки площади треугольника.
*/
 @Test
    public void whenOneAndOneThenNoTwo() {
       	Point a = new Point(0, 0);
       	Point b = new Point(1, 1);
       	Point c = new Point(2, 2);
        Triangle tr = new Triangle(a, b, c);
        double res = tr.area();
        double expected = 0.0;
        assertThat(res, closeTo(expected, 0.1));
    }
}