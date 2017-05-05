package ru.job4j.Extends;
/**
 * Engineer класс инженера.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Engineer  extends Profession{

    /**
     * Конструктор
     * @param name - имя
     * @param age - возраст
     * @param rang - ранг
     * @param salary - зарплата
     */
    public Engineer(String name, int age, byte rang, int salary) {
        super(name, age, rang, salary);
    }

    /**
     * experience - опыт сотрудника
     */
    private int experience;

    /**
     * Setter exp
     * @param experience - опыт
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * workOnMachine - метод показывающий сколько часов работал инженер
     * @param machine - машина
     * @return фраза
     */
    public String workOnMachine (Machine machine, int numbhours) {
        return String.format("%s worked by &s &d hours",getName(),machine,numbhours);
    }
}
