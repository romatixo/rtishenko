package ru.job4j.start;
/**
 * UserAction интерфейс для действий.
 * @author romatihsenko
 * @since 10.05.2017
 * @version 1
 */
public interface UserAction {
    /**
     * key - метод возвращает номер операции.
     * @return - key
     */
    int key();
    /**
     * execute - тело.
     * @param input - ввод
     * @param tracker - трэкер
     */
    void execute(Input input, Tracker tracker);
    /**
     * info - показывает инфу метода.
     * @return - инфу
     */
    String info();
}
