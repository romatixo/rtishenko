package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Рома on 12.06.2017.
 */
public class EvenIter implements Iterator{
    public final int maze[];
    public int index = 0;

    public EvenIter(int[] maze) {
        this.maze = maze;
    }

    @Override
    public boolean hasNext() {
        return maze.length > index;
    }

    @Override
    public Integer next() {
       int temp = 0;
       int count = 0;
       while (index < maze.length) {
           if (maze[index] % 2 == 0) {
               temp = maze[index++];
               break;
           } else {
               count++;
           }
           index++;
       }
       if (count == maze.length) {
           new NoSuchElementException("All element not even");
       }
        return  temp;
    }
}
