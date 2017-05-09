package ru.job4j.start;
/**
 * Input - интерфейс ввода.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public interface Input {
    /**
     * ask - метод вопроса.
     * @param question - вопрос
     * @return - ответ
     */
    String ask(String question);
}
