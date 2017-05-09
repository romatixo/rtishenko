package ru.job4j.Extends;
/**
 * Patient класс пациента.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Patient {
    /**
     * name - имя.
     */
    private String name;
    /**
     * disease - состояние.
     */
    private String disease;

    /**
     * Конструктор.
     * @param name - имя
     * @param disease - состояние
     */
    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    /**
     * getName - получение имени.
     * @return name
     */
    String getName() {
        return name;
    }

    /**
     * Установить состояние.
     */
    void setDisease() {
        this.disease = "healthy";
    }
}
