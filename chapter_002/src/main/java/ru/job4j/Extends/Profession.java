package ru.job4j.Extends;
/**
 * Profession класс для абстракции професий.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Profession {
    /**
     * name - имя работника
     */
    private String name;
    /**
     * age - количество лет
     */
    private int age;
    /**
     * rang - ранг специальности
     */
    private byte rang;
    /**
     * salary - зарплата
     */
    private int salary;

    /**
     * конструктор.
     * @param name - имя
     * @param age - возраст
     * @param rang - ранг
     * @param salary - зарплата
     */
    Profession(String name, int age, byte rang, int salary) {
        this.name = name;
        this.age = age;
        this.rang = rang;
        this.salary = salary;
    }

    /**
     * второй конструктор.
     */
    public Profession () {
    }

    /**
     * getName - получение имени работника
     * @return имя
     */
    String getName() {
        return name;
    }

    /**
     * Геттеор age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Геттер rang
     * @return rang
     */
    public byte getRang() {
        return rang;
    }

    /**
     * Геттер salary
     * @return salary
     */
    public int getSalary() {
        return salary;
    }
}
