package ru.job4j.list;

import java.util.Iterator;

/**
 * Created by Рома on 10.07.2017.
 */
public class ContainerOnTheList<E> implements SimpleList<E> {

    @Override
    public void add(E value) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return new ContIterator<E>();
    }

    class ContIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
