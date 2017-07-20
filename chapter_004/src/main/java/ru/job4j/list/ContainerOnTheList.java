package ru.job4j.list;

import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * ContainerOnTheList класс реализации LinkedList на связанном списке.
 * @author romatihsenko
 * @since 13.07.2017
 * @version 1
 */
public class ContainerOnTheList<E> implements SimpleList<E> {
    /**
     * size - size.
     */
    transient int size = 0;
    /**
     * Pointer to first node.
     */
    private Node<E> first;
    /**
     * Pointer to last node.
     */
    private Node<E> last;
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
     * @return item
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
    /*
     * ContIterator - класс итератора для контейнера.
     */
    class ContIterator<E> implements Iterator<E> {
        private int index = 0;
        /**
         * lastReturned - last returned value.
         */
        private Node<E> lastReturned;
        /**
         * nextReturned - next returned value.
         */
        private Node<E> nextReturned;
        /**
         * hasNext - method for check next el-t.
         * @return boolean
         */
        @Override
        public boolean hasNext() {
            return index < size;
        }
        /**
         * next - method for return el-t and move pointer.
         * @return - el-t.
         */
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


}
class Node<E> {
    /**
     * item - item.
     */
    E item;
    /**
     * next - pointer next el-t's.
     */
    Node<E> next;
    /**
     * prev - pointer previous el-t's.
     */
    Node<E> prev;
    public Node( Node<E> prev,E item, Node<E> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
