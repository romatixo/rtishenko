package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;

/**
 * Queen - королева.
 * @author romatihsenko
 * @since 18.05.2017
 * @version 1
 */
public class Queen extends Figure {
    /**
     * Конструктор.
     * @param position - poz
     */
    public Queen(Cell position) {
        super(position);
    }

    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] possibleway = new Cell[Math.abs(dist.getXcoordinate() - position.getXcoordinate()) > 0 ? Math.abs(dist.getXcoordinate() - position.getXcoordinate()) : Math.abs(dist.getYcoordinate() - position.getYcoordinate())];
        if ((dist.getXcoordinate() != position.getXcoordinate() || dist.getYcoordinate() != position.getYcoordinate()) &&
                (Math.abs(dist.getXcoordinate() - position.getXcoordinate()) == Math.abs(dist.getYcoordinate() - position.getYcoordinate())) ||
                (position.getXcoordinate() == dist.getXcoordinate()) || ( position.getYcoordinate() == dist.getYcoordinate())) {
               possibleway = this.formArray(possibleway, position, dist);
        } else {
            new ImpossibleMoveException("The move don't available");
        }
        return possibleway;
    }
}
