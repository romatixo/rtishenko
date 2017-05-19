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
        Cell[] possibleway = new Cell[3];
        if (dist.getXcoordinate() != position.getXcoordinate() && Math.abs(dist.getXcoordinate() - position.getXcoordinate()) == 3 && Math.abs(dist.getYcoordinate() - position.getYcoordinate()) == 2) {
            for (int i = 0; i < 3; i++) {
                if (dist.getXcoordinate() < position.getXcoordinate() && dist.getYcoordinate() < position.getYcoordinate()) {
                    possibleway[i] = new Cell(position.getYcoordinate() - i - 1, position.getXcoordinate() - i);
                } else if (dist.getXcoordinate() > position.getXcoordinate() && dist.getYcoordinate() < position.getYcoordinate()) {
                    possibleway[i] = new Cell(position.getYcoordinate() - i - 1, position.getXcoordinate() + i);
                } else if (dist.getXcoordinate() < position.getXcoordinate() && dist.getYcoordinate() > position.getYcoordinate()) {
                    possibleway[i] = new Cell(position.getYcoordinate() + i + 1, position.getXcoordinate() - i);
                } else if (dist.getXcoordinate() > position.getXcoordinate() && dist.getYcoordinate() > position.getYcoordinate()) {
                    possibleway[i] = new Cell(position.getYcoordinate() + i + 1, position.getXcoordinate() + i);
                }
            }
        } else {
            new ImpossibleMoveException("The move don't available");
        }
        return possibleway;
    }
}
