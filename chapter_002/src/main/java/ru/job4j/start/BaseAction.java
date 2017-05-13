package ru.job4j.start;

import javafx.event.ActionEvent;
import ru.job4j.models.Item;

public abstract class BaseAction implements UserAction {
    /**
     * name - имя.
     */
    public String name;
    /**
     * key - ключ.
     */
    private int key;

    /**
     * КОнструктор.
     * @param name - имя
     * @param key - ключ
     */
    public BaseAction(String name, int key) {
        this.name = name;
        this.key = key;
    }
        /**
         * key - вывод ключа операции.
         */
        public abstract int key();
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        public abstract void execute(Input input, Tracker tracker);
        /**
         * info - информация
         */
        public String info() {
            return String.format("%s. %s", this.key, name);
        }
    }

