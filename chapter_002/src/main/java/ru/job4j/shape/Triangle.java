package ru.job4j.shape;
/**
 * Triangle класс треугольника.
 * @author romatihsenko
 * @since 10.05.2017
 * @version 1
 */
public class Triangle implements Shape {
    /**
     * Реализация метода для треугольника.
     * @return псевдографика
     */
    @Override
    public String pic() {
        return "  .  \r\n . . \r\n.....";
    }
}
