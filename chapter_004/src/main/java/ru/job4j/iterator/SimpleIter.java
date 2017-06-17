package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * SimpleIter класс итератора простых чисел.
 * @author romatihsenko
 * @since 17.06.2017
 * @version 1
 */
public class SimpleIter implements Iterator {
    public final int maze[];
    public int index = 0;

    public SimpleIter(int[] maze) {
        this.maze = maze;
    }

    @Override
    public boolean hasNext() {
        return  find() == -1 ? false : true;
    }

    @Override
    public Object next() {
        index = find();
        if (index == -1) {
            throw new NoSuchElementException("All elements is not Prime");
        } else {
            return maze[index++];
        }
    }

    public int find() {
        int res = -1;
        for (int i = index; i < maze.length; i++) {

            if (isPrime(maze[i])) {
                res = i;
                break;
            }
        }
        return  res;
    }
    public boolean isPrime(int number) {
        boolean f = false;
        int count = 1;
        if (number == 1) {
            f = true;
        } else if (number == 2) {
            f = true;
        } else if (number ==3) {
            f = true;} else {
            for (int i = 1 ; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
        }
        if (count == 2) {
            f = true;
        }
        return f;
    }
}
