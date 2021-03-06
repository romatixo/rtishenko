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

    /**
     * @param array - входной массив.
     * @return - лист
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

    /**
     * @param list - входной лист.
     * @param rows - кол-во строк.
     * @return массив сформированный из листа.
     */
    public int[][] toArray (List<Integer> list, int rows) {
        int width = 0;
        
        
        
        if (list.size() % rows != 0) {
            width = list.size();
            while (width % rows != 0) {
                width++;
            }
        }
        width = (int)list.size()/rows;
            
        int[][] array = new int[rows][width];
        Iterator<Integer> iterator = list.iterator();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows && iterator.hasNext(); j++) {
                array[i][j] = iterator.next();
            }
        }
        return array;
    }

    /**
     * @param list - лист массивов.
     * @return лист включающий в себя все эл-ты первого листа.
     */
    public List<Integer> convert (List<int[]> list) {
        List<Integer> publiclist = new ArrayList<>();
        Iterator<int[]> iterator = list.iterator();
        while (iterator.hasNext()) {
            for (int value : iterator.next()) {
                publiclist.add(value);
            }
        }
        return publiclist;
    }
}
