package ru.job4j.сhess;


import ru.job4j.сhess.figure.Elephant;
import ru.job4j.сhess.figure.Figure;
/**
 * Board - доска.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class Board {
    /**
     * Массив фигур.
     */
    private Figure[] figures = new Figure[32];
    /**
     * move - метод движения фигуры.
     * @param source - выбранная точка
     * @param dist - конечная точка
     * @return - признак завершения хода
     * @throws ImpossibleMoveException - искл
     * @throws OccupiedWayException - искл
     * @throws FigureNotFoundException - искл
     * @throws OutPerBoardException - искл
     */
   public boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException,OutPerBoardException {
        boolean resolution = true;
        boolean flag = false;
        for (Figure figure : figures) {
            if (figure != null &&figure.position.getXcoordinate() == source.getXcoordinate() && figure.position.getYcoordinate() == source.getYcoordinate()) {
                flag = true;
                if (dist.getXcoordinate() >= 0 && dist.getXcoordinate() <= 7 && dist.getYcoordinate() >=0 && dist.getYcoordinate() <= 7 && source.getXcoordinate() >= 0 && source.getXcoordinate() <= 7 && source.getYcoordinate() >=0 && source.getYcoordinate() <= 7) {
                    Cell[] figureway = figure.way(dist);
                    for (Cell cell : figureway) {
                        for (Figure stayfigure : figures) {
                            if (stayfigure != null && stayfigure.position.getXcoordinate() != cell.getXcoordinate() && stayfigure.position.getYcoordinate() != cell.getYcoordinate()) {
                                figure.position.setXcoordinate(dist.getXcoordinate());
                                figure.position.setYcoordinate(dist.getYcoordinate());
                            } else {
                                new OccupiedWayException("The course is not possible");
                            }
                        }
                    }
                } else new OutPerBoardException("Out of bounds Board");
            }
            if (!flag) {
                new FigureNotFoundException("Figure not found");
            }
        }
        return resolution;
    }
}
