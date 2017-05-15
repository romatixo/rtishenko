package ru.job4j.сhess;
/**
 * OccupiedWayException - исключение врезания фигуры в другую фигуру.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class OccupiedWayException extends RuntimeException {
    /**
     * @param message - сообщение.
     */
    public OccupiedWayException(String message) {
        super(message);
    }
}
