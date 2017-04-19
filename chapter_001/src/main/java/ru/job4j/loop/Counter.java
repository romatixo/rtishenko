package ru.job4j.loop;
/**
* Counter класс для суммы чётных чисел по диапозону.
* @author romatihsenko
* @since 18.04.2017
* @version 1
*/
public class Counter {
	/**
	* add - метод для подсчёта суммы чётных эл-то в указ. диапазоне.
	* @param start - начало подсчёта
	* @param finish -конец подсчёта
	* @return возврат суммы
	*/
	public int add(int start, int finish) {
		int sum = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}