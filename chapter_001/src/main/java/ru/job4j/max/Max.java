package ru.job4j.max;
/**
* Max класс для отбора макс.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class Max {
	/**
    * max - метод выбора максимума.
    * @param first - первый аргумент
    * @param second - второй аргумент
    * @return - возвращает максимум из двух чисел
    */
    public int max(int first, int second) {
    	return first > second ? first : second;
    }
    /**
    * max - метод выбора максимума.
    * @param first - первый аргумент
    * @param second - второй аргумент
    * @param third - третий арг
    * @return - возвращает максимум из трех чисел
    */
    public int max(int first, int second, int third) {
       return max(max(first, second), third);
    }
}