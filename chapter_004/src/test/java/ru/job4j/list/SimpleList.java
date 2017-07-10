package ru.job4j.list;

/**
 * Created by Рома on 10.07.2017.
 */
public interface SimpleList<E> extends Iterable<E> {/**
     * add - method for adding el-ts.
     * @param value - value
    */
    public void add(E value);
    /**
     * get - method for getting el-ts.
     * @param index - index.
     * @return el-t.
     */
    public E get(int index);
}
