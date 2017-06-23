package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * EvenIter класс итератора четных чисел.
 * @author romatihsenko
 * @since 17.06.2017
 * @version 1
 */
public class EvenIter implements Iterator{
    /**
     * maze - входной массив.
     */
    public final int maze[];
    /**
     * index - счётчик.
     */
    public int index = 0;

    /**
     * Конструктор.
     * @param maze - входной массив.
     */
    public EvenIter(int[] maze) {
        this.maze = maze;
    }

    /**
     * hasNext - метод проверки на существование сл эл-та.
     * @return логическое значение.
     */
    @Override
    public boolean hasNext() {
        return even() == -1 ? false : true;
    }

    /**
     * next - метод получения тек-го эл-та.
     * @return Эл-т.
     */
    @Override
    public Integer next() {
        index = even();
        if (index == -1) {
            throw new NoSuchElementException("All element not even");
        } else {
            return maze[index++];
                }
        }

    /**
     * even - метод проверки на чётность.
     * @return номер эл-та.
     */
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
