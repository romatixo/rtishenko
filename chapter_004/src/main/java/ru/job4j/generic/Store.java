package ru.job4j.generic;
/**
 * Store интерфейс.
 * @author romatihsenko
 * @since 7.07.2017
 * @version 1
 */
public interface Store<T extends Base> {
    /**
     * add - method adding el-t.
     * @param value - value.
     */
    public void add(T value);
    /**
     * delete - method deleting el-t.
     * @param id - id.
     */
    public void delete(String id);

    /**
     * update - method to update el-t.
     * @param value - value
     * @param id - id
     */
    public void update(T value, String id);
}
