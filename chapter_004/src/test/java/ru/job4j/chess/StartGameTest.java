package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.сhess.Cell;
import ru.job4j.сhess.figure.Elephant;
import ru.job4j.сhess.figure.Queen;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * StunInputTest класс теста меню.
 * @author romatihsenko
 * @since 09.05.2017
 * @version 1
 */
public class StartGameTest {
    /**
     * Тест проверки метода add.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Elephant elephant = new Elephant(new Cell(1,1));
        Cell[] result = elephant.way(new Cell(3,0));
        Cell[] expexted = new Cell[] {new Cell(3,7)};
        assertThat(result[0].getXcoordinate(), is(expexted[0].getXcoordinate()));
        assertThat(result[0].getYcoordinate(), is(expexted[0].getYcoordinate()));
    }
    @Test
    public void whenQueenItemWithSameName() {
        Queen queen = new Queen(new Cell(1,1));
        Cell[] result = queen.way(new Cell(2,2));
        Cell[] expexted = new Cell[] {new Cell(2,2)};
        assertThat(result[0].getXcoordinate(), is(expexted[0].getXcoordinate()));
        assertThat(result[0].getYcoordinate(), is(expexted[0].getYcoordinate()));
    }
    @Test
    public void whenQueenItemWithSame() {
        Queen queen = new Queen(new Cell(1,1));
        Cell[] result = queen.way(new Cell(1,3));
        Cell[] expexted = new Cell[] {new Cell(1,2), new Cell(1,3)};
        assertThat(result[0].getXcoordinate(), is(expexted[0].getXcoordinate()));
        assertThat(result[0].getYcoordinate(), is(expexted[0].getYcoordinate()));
        assertThat(result[1].getXcoordinate(), is(expexted[1].getXcoordinate()));
        assertThat(result[1].getYcoordinate(), is(expexted[1].getYcoordinate()));
    }
}