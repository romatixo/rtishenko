package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* PaintTest класс теста рисования пирамиды числа.
* @author romatihsenko
* @since 19.04.2017
* @version 1
*/
public class PaintTest {
/**
* Тест пирамиды.
*/
@Test
    public void whenThreeThenThinks() {
        Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}