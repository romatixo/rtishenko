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
    	int max;
    	max = first > second ? first : second;
    	return max;
    }
}