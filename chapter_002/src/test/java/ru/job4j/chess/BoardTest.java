package ru.job4j.chess;
import org.junit.Test;
import ru.job4j.сhess.Board;
import ru.job4j.сhess.Cell;
import ru.job4j.сhess.figure.Elephant;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    /**
     * Тест проверки метода move.
     */
    @Test
    public void whenFigureMoveThenTrue() {

        boolean expexted = true;
        boolean result =  new Board().move(new Cell(0, 0), new Cell(2, 2));
        assertThat(result, is(expexted));
    }
}
