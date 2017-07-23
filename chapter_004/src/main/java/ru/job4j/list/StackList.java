package ru.job4j.list;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Рома on 19.07.2017.
 */

public class StackList<E> implements Iterable<E> {
    /**
     * size - size.
     */
    transient int size = 0;
    /**
     * /**
     * Pointer to first node.
     */
    Node<E> first = new Node<E>(null, null, null);
    /**
     * Pointer to last node.
     */
    Node<E> last = new Node<E>(null, null, null);

    /**
     * push - method adding el-ts.
     * @param value - value
     */
    public void push(E value) {
        Node<E> tempNode = new Node<E>(null, value, null);
        if (this.last.item == null) {
            this.last.item = value;
        } else {
            tempNode.next = this.first;
            this.first.prev = tempNode;
        }
        this.first = tempNode;
        size++;
    }

    /**
     * pop - method remove first el-t.
     * @return first el-t.
     */
    public E pop() {
        E result = null;
        if (this.first.item != null) {
            result = this.first.item;
            if (this.first.next != null) {
                this.first = this.first.next;
            } else {
                this.first = null;
            }
        }
        size--;
        return result;
    }


    /**
     * iterator - iterator.
     * @return iterator.
     */
    @Override
    public Iterator<E> iterator() {
        return new StackIterator<E>();
    }

    /**
     * StackIterator - iterator for StackList.
     * @param <E> - value
     */
    public class StackIterator<E> implements Iterator<E> {
        /**
         * currentNode - node.
         */
        Node<E> currentNode = (Node<E>) first;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E result = null;
            if (currentNode == null) {
                throw new NoSuchElementException();
            } else {
                result = currentNode.item;
                currentNode = currentNode.next;
            }
            return result;
        }
    }
}
