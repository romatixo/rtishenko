package ru.job4j.generic;
/**
 * User класс пользователя.
 * @author romatihsenko
 * @since 7.07.2017
 * @version 1
 */
public class User extends Base {
    /**
     * id -id.
     */
    private String id;

    public User(String id) {
        this.id = id;
    }

    /**
     * getId - getter.
     * @return
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * setId - setter.
     * @param id - id.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
