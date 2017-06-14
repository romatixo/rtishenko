package ru.job4j.mapbank;
/**
 * User класс пользователя.
 * @author romatihsenko
 * @since 1.06.2017
 * @version 1
 */
public class User {
    /**
     * @param name - имя.
     * @param password - пароль.
     */
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * name - имя.
     */
    private String name;
    /**
     * password - пароль.
     */
    private String password;

    /**
     * @return - имя.
     */
    public String getName() {
        return name;
    }

    /**
     * @return - пароль.
     */
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
