package ru.job4j.generic;

/**
 * Created by Рома on 05.07.2017.
 */
public interface Store<T extends Base> {
    public void add(T value);
    public void delete(int idvalue);
    public void update(T value, int idvalue);
}
