package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;
/**
 * Elephant - слон.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class Elephant extends Figure {
    /**
     * Конструктор.
     * @param position - poz
     */
    public Elephant(Cell position) {
        super(position);
    }
    /**
     * way - метод проверки возможности хождения.
     * @param dist - конечная точка
     * @return - массив клеток
     * @throws ImpossibleMoveException - исключение
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {
        Cell[] possibleway = new Cell[Math.abs(dist.getXcoordinate() - position.getXcoordinate())];
            if (dist.getXcoordinate() != position.getXcoordinate() && Math.abs(dist.getXcoordinate() - position.getXcoordinate()) == Math.abs(dist.getYcoordinate() - position.getYcoordinate())) {
                 possibleway = this.formArray(possibleway, position, dist);
            } else {
                 new ImpossibleMoveException("The move don't available");
            }
        return possibleway;
    }
}
