package ru.job4j.chess;
import org.junit.Test;
import ru.job4j.сhess.Board;
import ru.job4j.сhess.Cell;
import ru.job4j.сhess.FigureNotFoundException;
import ru.job4j.сhess.OutPerBoardException;
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
    @Test(expected = OutPerBoardException.class)
    public void whenFigureMoveThenTrue1() {


        boolean result =  new Board().move(new Cell(-1, 0), new Cell(-2, 2));

    }
    /**
     * Тест проверки метода move.
     */
    @Test
    public void whenQueenMoveThenTrue() {

        boolean expexted = true;
        boolean result =  new Board().move(new Cell(0, 0), new Cell(2, 2));
        assertThat(result, is(expexted));
    }
}
