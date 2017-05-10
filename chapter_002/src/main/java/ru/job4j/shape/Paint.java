package ru.job4j.shape;
/**
 * Paint класс рисования фигур.
 * @author romatihsenko
 * @since 10.05.2017
 * @version 1
 */
public class Paint {
    /**
     * draw - метод вывода в консоль.
     * @param shape - реализация класса
     */
    public void draw(Shape shape) {
        System.out.println(shape.pic());
    }
}
