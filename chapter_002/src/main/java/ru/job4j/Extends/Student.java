package ru.job4j.Extends;
/**
 * Student класс студента.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Student {
    public Student(String name, int grade, int mind) {
        this.name = name;
        this.grade = grade;
        this.mind = mind;
    }

    private String name;
    private int grade;
    private int mind = 0;

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getMind() {
        return mind;
    }

    void setMind() {
        this.mind = 1000;
    }
}
