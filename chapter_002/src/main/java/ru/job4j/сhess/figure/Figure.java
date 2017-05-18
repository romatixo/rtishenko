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

    public Cell[] formArray(Cell[] cells, Cell sourse, Cell dist) {
        int destX = dist.getXcoordinate();
        int destY = dist.getYcoordinate();
        int posX = sourse.getXcoordinate();
        int posY = sourse.getYcoordinate();
        int stepX = destX > posX ? 1 : destX < posX ? -1 : 0;
        int stepY = destY > posY ? 1 : destY < posY ? -1 : 0;
        for (int i = 0; i < cells.length; i++) {
            posX += stepX;
            posY += stepY;
            cells[i] = new Cell(posX, posY);
        }
        return cells;
    }
}
