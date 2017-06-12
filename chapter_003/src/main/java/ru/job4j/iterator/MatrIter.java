package ru.job4j.iterator;

import java.util.Iterator;

/**
 * Created by Рома on 12.06.2017.
 */
public class MatrIter implements Iterator {
    public final int maze[][];
    public int indexI = 0;
    public int indexY = 0;
    public MatrIter(int[][] maze) {
        this.maze = maze;
    }

    @Override
    public boolean hasNext() {
        return maze.length > indexI && maze[maze.length - 1].length > indexY;
    }

    @Override
    public Integer next() {
        int temp = 0;
        if (indexI < maze.length) {
            if (indexY < maze[indexI].length) {
                temp = maze[indexI][indexY];
                indexY++;
            } else {
                indexI++;
                indexY = 0;
                temp = maze[indexI][indexY++];
            }
        }
        return temp;
    }
}
