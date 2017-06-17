package ru.job4j.iterator;

import java.util.Iterator;

/**
 * Created by Рома on 12.06.2017.
 */
public class MatrIter implements Iterator {
    public final int maze[][];
    public int column = 0;
    public int row = 0;
    public MatrIter(int[][] maze) {
        this.maze = maze;
    }

    @Override
    public boolean hasNext() {
        return maze.length > column && maze[maze.length - 1].length > row;
    }

    @Override
    public Integer next() {
        int temp = 0;
        if (column < maze.length) {
            if (row < maze[column].length) {
                temp = maze[column][row];
                row++;
            } else {
                column++;
                row = 0;
                temp = maze[column][row++];
            }
        }
        return temp;
    }
}
