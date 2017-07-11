package ru.job4j.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Рома on 10.07.2017.
 */
public class ContainerOnTheList<E> implements SimpleList<E> {
    transient int size = 0;
    /**
     * Pointer to first node.
     */
    Node<E> first;
    /**
     * Pointer to last node.
     */
    Node<E> last;

    /**
     * add - method adding el-t.
     * @param value - value
     */
    @Override
    public void add(E value) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(l, value, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    /**
     * get - method getting el-t.
     * @param index - index.
     * @return
     */
    @Override
    public E get(int index) {
        Node<E> value = first;
        int i = 0;
        if (index > size || first == null) {
            new NoSuchElementException("Index is out size");
        }
        while(i < index) {
            value = value.next;
            i++;
        }
        return value.item;
    }

    /**
     * iterator - method for adding iterator for list.
     * @return iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new ContIterator<E>();
    }

    class ContIterator<E> implements Iterator<E> {
        private int index = 0;
        private Node<E> lastReturned ;
        private Node<E> nextReturned;
        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            Node<E> result = new Node<E>(null, null, null);

            if (index == 0) {
                lastReturned = (Node<E>) first;
                nextReturned = lastReturned.next;
                index++;
                return lastReturned.item;
            }
            lastReturned = nextReturned;
            nextReturned = nextReturned.next;
            index++;
            return lastReturned.item;
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node( Node<E> prev,E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
