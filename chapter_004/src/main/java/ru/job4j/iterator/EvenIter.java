package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Рома on 12.06.2017.
 */
public class EvenIter implements Iterator{
    public final int maze[];
    public int index = 0;
    public int temp = -1;

    public EvenIter(int[] maze) {
        this.maze = maze;
    }

    @Override
    public boolean hasNext() {

        return even() == -1 ? false : true;
    }

    @Override
    public Integer next() {
        index = even();
        if (index == -1) {
            throw new NoSuchElementException("All element not even");
        } else {
            return maze[index++];
                }
        }

    public int even() {
        int res = -1;
        for (int i = index; i < maze.length; i++) {
            if (maze[i] % 2 == 0) {
                res = i;
                break;
            }
        }
        return res;
    }
}
