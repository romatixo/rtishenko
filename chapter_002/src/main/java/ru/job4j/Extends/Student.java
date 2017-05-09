package ru.job4j.Extends;
/**
 * Student класс студента.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Student {
    /**
     * name - имя.
     */
    private String name;

    /**
     * Конструктор.
     * @param name - имя
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * Геттер.
     * @return name
     */
    String getName() {
        return name;
    }
}
