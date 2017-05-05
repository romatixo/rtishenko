package ru.job4j.Extends;
/**
 * Machine класс машины.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Machine {
    private String name;
    private int model;

    public Machine(String name, int model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
