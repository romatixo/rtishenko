package ru.job4j.iterator;

import java.util.Iterator;

/**
 * ConvertIter класс итератора итераторов.
 * @author romatihsenko
 * @since 17.06.2017
 * @version 1
 */
public class ConvertIter implements Iterator{
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        Iterator iter = new Iterator() {
            private final Iterator<Iterator<Integer>> it;

            Iterator(Iterator<Iterator<Integer>> it){

                this.it = it;
            }
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
