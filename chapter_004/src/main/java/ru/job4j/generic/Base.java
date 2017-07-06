package ru.job4j.generic;
/**
 * Base абстрактный класс .
 * @author romatihsenko
 * @since 5.07.2017
 * @version 1
 */
public abstract class Base {
    public Base(String id) {
        this.id = id;
    }

    /**
     * id - id.
     */
    private String id;

    /**
     * getId - getter.
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * setId - set id.
     * @param id - id.
     */
    public void setId(String id) {
        this.id = id;
    }
}
