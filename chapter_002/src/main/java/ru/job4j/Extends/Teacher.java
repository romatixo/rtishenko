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
     * teach - метод .
     * @param student - студент
     * @return фразу
     */
    public String teach (Student student) {
        student.setMind();
        return "Teacher " + getName() + " teaches " + student.getName();
    }
}
