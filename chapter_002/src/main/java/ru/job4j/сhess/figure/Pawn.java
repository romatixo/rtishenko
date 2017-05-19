package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;
/**
 * Pawn - пешка.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class Pawn extends Figure {
    /**
     * Конструктор.
     * @param position - poz
     */
    public Pawn(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] possibleway = new Cell[Math.abs(dist.getYcoordinate() - position.getYcoordinate())];
        if (dist.getYcoordinate() != position.getYcoordinate() && position.getXcoordinate() == dist.getXcoordinate()) {
            possibleway = this.formArray(possibleway, position, dist);
        } else {
            new ImpossibleMoveException("The move don't available");
        }
        return possibleway;
    }
}
