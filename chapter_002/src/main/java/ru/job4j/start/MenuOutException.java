package ru.job4j.start;
/**
 * MenuOutException класс исключения для меню.
 * @author romatihsenko
 * @since 11.05.2017
 * @version 1
 */
public class MenuOutException extends RuntimeException {
    /**
     * @param message - сообщение.
     */
    public MenuOutException(String message) {
        super(message);
    }
}
