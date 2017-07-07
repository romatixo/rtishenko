package ru.job4j.generic;
/**
 * AbstractStore абстрактный класс реализации Store.
 * @author romatihsenko
 * @since 7.07.2017
 * @version 1
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {
    /**
     * arr - Container of objects.
     */
    public SimpleArray<T> arr;

    /**
     * add - method adding el-t.
     * @param value - value.
     */
    public void add(T value) {
        this.arr.add(value);
    }

    /**
     * delete - method deleting el-t.
     * @param id - id.
     */
    public void delete(String id) {
        this.arr.delete(id);
    }

    /**
     * update - method to update el-t.
     * @param value - value
     * @param id - id
     */
    public void update(T value, String id) {
        this.arr.update(id, value);
    }

}
