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
    /**
     * maze - входящий массив.
     */
    public final int[] maze;
    /**
     * index - счётчик.
     */
    public int index = 0;

    /**
     * Конструктор.
     * @param maze - входящий массив.
     */
    public SimpleIter(int[] maze) {
        this.maze = maze;
    }

    /**
     * проверка на существование сл эл-тов
     * @return логическое значение.
     */
    @Override
    public boolean hasNext() {
        return  find() == -1 ? false : true;
    }

    /**
     * Метод возвращающий текущий подходящий эл-т массива.
     * @return эл-т массива.
     */
    @Override
    public Object next() {
        index = find();
        if (index == -1) {
            throw new NoSuchElementException("All elements is not Prime");
        } else {
            return maze[index++];
        }
    }

    /**
     * метод поиска простого числа.
     * @return индекс эл-та.
     */
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

    /**
     * Метод проверки числа на простоту.
     * @param number входящее число.
     * @return логическое значение.
     */
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
