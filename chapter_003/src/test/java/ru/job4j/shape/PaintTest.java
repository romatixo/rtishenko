package ru.job4j.shape;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PaintTest класс теста трекера.
 * @author romatihsenko
 * @since 10.05.2017
 * @version 1
 */
public class PaintTest {
    /**
     * Тест проверки прорисовки квадрата.
     */
    @Test
    public void whenSquareThenSquare() {
        Square square = new Square();
        assertThat(square.pic(), is(".....\r\n.   .\r\n....."));
    }
     /**
     * Тест проверки прорисовки квадрата.
     */
    @Test
    public void whenTriangleThenTriangle() {
        Triangle square = new Triangle();
        assertThat(square.pic(), is("  .  \r\n . . \r\n....."));
    }
    /**
     * Тест проверки прорисовки квадрата.
     */
    @Test
    public void whenDrawThenTriangle() {
        Paint paint = new Paint();

        Triangle square = new Triangle();
        assertThat(square.pic(), is("  .  \r\n . . \r\n....."));
    }
}