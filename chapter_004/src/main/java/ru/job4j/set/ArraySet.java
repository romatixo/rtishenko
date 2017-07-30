package ru.job4j.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Рома on 30.07.2017.
 */
public class ArraySet<E> implements Iterable<E> {
    /**
     * arr - container.
     */
    private List<E> arr = new ArrayList<E>();
    /**
     * Method to add element to set.
     * @param value - element
     */
    boolean add(E value) {
        boolean result = false;
        if (!arr.contains(value)) {
            arr.add(value);
            result = true;
        }
        return result;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * index - index.
             */
            private int index = 0;


            @Override
            public boolean hasNext() {
                return arr.size() > index;
            }

            @Override
            public E next() {
                return (E)arr.get(index++) ;
            }
        };
    }
}

