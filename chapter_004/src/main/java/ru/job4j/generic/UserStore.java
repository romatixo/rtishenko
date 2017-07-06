package ru.job4j.generic;

/**
 * Created by Рома on 05.07.2017.
 */
public class UserStore implements Store {
    SimpleArray<User> userarr;
    public UserStore(int size) {
        this.userarr = new SimpleArray<>(size);
    }

    @Override
    public void add(Base value) {
        userarr.add((User) value);
    }

    @Override
    public void delete(int idvalue) {

        userarr.delete(2);
    }

    @Override
    public void update(Base value, int idvalue) {

    }
}
