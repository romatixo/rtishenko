package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;
/**
 * SimpleLinkedList класс реализации LinkedList на массиве.
 * @author romatihsenko
 * @since 10.07.2017
 * @version 1
 */
public class SimpleLinkedList<E> implements Iterable<E> {
    /**
     * container - container for el-ts.
     */
    Object[] container;
    /**
     * size of container.
     */
    int size;
    /**
     * temporary el-t index.
     */
    int index = 0;

    public SimpleLinkedList(int size) {
        this.size = size;
        this.container = new Object[size];
    }

    /**
     * add - method for adding el-ts.
     * @param value - value
     */
    public void add(E value) {
        if (index == size) {
            container = Arrays.copyOf(container,size * 2);
        }
        container[index++] = value;
    }

    /**
     * get - method for getting el-ts.
     * @param index - index.
     * @return el-t.
     */
    public E get(int index) {
        return (E)container[index];
    }

    /**
     * iterator - method to return iterator.
     * @return iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new IteratorList<>();
    }



    public class IteratorList<T> implements Iterator<T> {
        /**
         * position - current pos.
         */
        int position = 0;

        @Override
        public boolean hasNext() {
            return position < container.length;
        }

        @Override
        public T next() {
            return (T) container[position++];
        }
    }
}
