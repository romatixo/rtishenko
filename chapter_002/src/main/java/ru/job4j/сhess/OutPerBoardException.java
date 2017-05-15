package ru.job4j.сhess;
/**
 * OutPerBoardException - исключение выхода за границы доски.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class OutPerBoardException extends RuntimeException {
    /**
     * @param message - mess.
     */
    public OutPerBoardException(String message) {
        super(message);
    }
}
