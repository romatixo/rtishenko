package ru.job4j.сhess;
/**
 * ImpossibleMoveException - исключение фигура может так ходить.
 * @author romatihsenko
 * @since 15.05.2017
 * @version 1
 */
public class ImpossibleMoveException extends RuntimeException {
    /**
     * @param message - сообщение.
     */
    public ImpossibleMoveException(String message) {
        super(message);
    }
}
