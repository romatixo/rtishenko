package ru.job4j.Extends;
/**
 * Machine класс машины.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Machine {
    /**
     * name - имя.
     */
    private String name;
    /**
     * model - модель.
     */
    private int model;

    /**
     * Конструктор.
     * @param name - имя
     * @param model - модель
     */
    public Machine(String name, int model) {
        this.name = name;
        this.model = model;
    }
}
