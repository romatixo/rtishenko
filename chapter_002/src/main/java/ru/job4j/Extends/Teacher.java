package ru.job4j.Extends;
/**
 * Teacher класс учителя.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Teacher extends Profession {
    /**
     * Конструктор
     * @param name - имя
     * @param age - возраст
     * @param rang - ранг
     * @param salary - зарплата
     */
    public Teacher(String name, int age, byte rang, int salary) {
        super(name, age, rang, salary);
    }

    /**
     * количество студентов учителя
     */
    private int numberofstudents;

    /**
     * Геттер
     * @return количество студентов
     */
    public int getNumberofstudents() {
        return numberofstudents;
    }

    /**
     * teach - метод .
     * @param numberofstudents - количество студентов
     * @return фразу
     */
    public String teach (int numberofstudents) {
        return "Teacher " + getName() + " teaches " + numberofstudents + "students";
    }
}
