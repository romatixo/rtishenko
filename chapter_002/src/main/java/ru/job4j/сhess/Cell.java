package ru.job4j.сhess;
/**
 * Cell - клетка.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class Cell {
    /**
     * x координата.
     */
    private int xcoordinate;
    /**
     * y - координата.
     */
    private int ycoordinate;

    /**
     * Конструктор.
     * @param xcoordinate - x координата.
     * @param ycoordinate - y координата.
     */
    public Cell(int ycoordinate, int xcoordinate) {
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
    }

    /**
     * @return x.
     */
    public int getXcoordinate() {
        return xcoordinate;
    }

    /**
     * @param xcoordinate x.
     */
    public void setXcoordinate(int xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    /**
     * @return y.
     */
    public int getYcoordinate() {
        return ycoordinate;
    }

    /**
     * @param ycoordinate -y.
     */
    public void setYcoordinate(int ycoordinate) {
        this.ycoordinate = ycoordinate;
    }

}
