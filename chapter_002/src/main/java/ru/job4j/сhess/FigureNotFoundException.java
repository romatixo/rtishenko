package ru.job4j.сhess;
/**
 * FigureNotFoundException - исключение фигура не доступна.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class FigureNotFoundException extends RuntimeException {
    /**
     * @param message сообщение
     */
    public FigureNotFoundException(String message) {
        super(message);
    }
}
