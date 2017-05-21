package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;
/**
 * Knight - конь.
 * @author romatihsenko
 * @since 19.05.2017
 * @version 1
 */
public class Knight extends Figure {
    /**
     * Конструктор.
     * @param position - poz
     */
    public Knight(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] possibleway = new Cell[1];
        if (dist.getXcoordinate() != position.getXcoordinate() && Math.abs(dist.getXcoordinate() - position.getXcoordinate()) == 3 && Math.abs(dist.getYcoordinate() - position.getYcoordinate()) == 2) {
            possibleway[0] = new Cell(dist.getXcoordinate(), dist.getYcoordinate());
        } else {
            new ImpossibleMoveException("The move don't available");
        }
        return possibleway;
    }
}
