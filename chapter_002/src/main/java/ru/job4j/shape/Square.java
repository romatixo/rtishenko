package ru.job4j.shape;
/**
 * Square класс квадрата.
 * @author romatihsenko
 * @since 10.05.2017
 * @version 1
 */
public class Square implements Shape {
    /**
     * pic - реализация метода для квадрата.
     * @return псевдографика фигуры
     */
    @Override
    public String pic() {
        return ".....\r\n.   .\r\n.....";
    }
}
