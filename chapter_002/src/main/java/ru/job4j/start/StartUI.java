package ru.job4j.start;
/**
 * StartUI класс программы.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class StartUI {
    /**
     * input - вариант ввода.
     */
    private Input input;
    /**
     * tracker - вариант реализации хранения данных.
     */
    private Tracker tracker;
    /**
     * Конструктор.
     * @param input - ввод
     * @param tracker - хранение
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * flag.
     */
    public static boolean flag = false;
    /**
     * Метод работы с меню.
     */
    public void init() {
        MenuTracker menuTracker = new MenuTracker(this.input, this.tracker);
        menuTracker.fillActions();

        while (!this.flag) {
            menuTracker.show();
           int key = Integer.valueOf(this.input.ask("Select: "));
            menuTracker.select(key);
        }
    }
     /**
     * main - главный метод.
     * @param args - арг
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
