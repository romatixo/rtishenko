package ru.job4j.convert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Double.parseDouble;

/**
 * ConvertMass класс работы с кол.
 * @author romatihsenko
 * @since 21.05.2017
 * @version 1
 */
public class ConvertMass {
    /*
    * toList - метод добавления матрицы в лист.
     */
    public List<Integer> toList (int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }
    public int[][] toArray (List<Integer> list, int rows) {
        int[][] array = new int[rows][rows];
        if (list.size() % rows != 0) {
            while (list.size() % rows != 0) {
                list.add(new Integer(0));
            }
        }
        Iterator<Integer> iterator = list.iterator();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = iterator.next();
            }
        }
        return array;
    }
}
