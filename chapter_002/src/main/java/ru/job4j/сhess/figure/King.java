package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;
/**
 * King - король.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class King extends Figure {
    /**
     * Конструктор.
     * @param position - poz
     */
    public King(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] possibleway = new Cell[1];
        if (Math.abs(dist.getXcoordinate() - position.getXcoordinate()) <= 1 && Math.abs(dist.getYcoordinate() - position.getYcoordinate()) <= 1) {
            possibleway = this.formArray(possibleway, position, dist);
        } else {
            new ImpossibleMoveException("The move don't available");
        }
        return possibleway;
    }
}
