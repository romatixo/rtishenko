package ru.job4j.сhess.figure;

import ru.job4j.сhess.Cell;
import ru.job4j.сhess.ImpossibleMoveException;
/**
 * Figure - фигура.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public abstract class Figure {
    /**
     * Позиция фигуры.
     */
    public Cell position;

    /**
     * Конструктор.
     * @param position - poz
     */
    public Figure(Cell position) {
        this.position = position;
    }

    /**
     * way - метод проверки пути.
     * @param dist - конечная точка
     * @return - массив клеток
     * @throws ImpossibleMoveException - исключение
     */
    public abstract Cell[] way(Cell dist) throws ImpossibleMoveException;
}
