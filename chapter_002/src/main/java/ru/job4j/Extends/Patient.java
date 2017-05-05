package ru.job4j.Extends;
/**
 * Patient класс пациента.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Patient {
    private String name;
    private String disease;

    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    void setDisease() {
        this.disease = "healthy";
    }
}
