package ru.job4j.Extends;
/**
 * Doctor класс доктора.
 * @author romatihsenko
 * @since 02.05.2017
 * @version 1
 */
public class Doctor extends Profession{
    /**
     * Конструктор
     * @param name - имя
     * @param age - возраст
     * @param rang - ранг
     * @param salary - зарплата
     */
    public Doctor(String name, int age, byte rang, int salary) {
        super(name, age, rang, salary);
    }

    /**
     * heal - метод для лечения доктором пациента
     * @param patient - пациент
     * @return фраза
     */
    public String heal(Patient patient) {
        return String.format("Doctor %s heal a %s" ,getName(),patient.getName());
    }

    /**
     * operationdo - метод проверки результата
     * @param patient - имя пациента
     * @return получиться операция или нет
     */
    public boolean operationdo (Patient patient) {
        patient.setDisease();
        return true;
    }
}
