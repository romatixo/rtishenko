package ru.job4j.loop;
/**
* Factorial класс для подсчёта факториала числа.
* @author romatihsenko
* @since 19.04.2017
* @version 1
*/
public class Factorial {
	/**
	* calc - метод подсчёта факториала .
	* @param n - число , факториал которого будем считать
	* @return факториал числа n
	*/
	public int calc(int n) {
		int fact = 1;
		if (n == 0) {
			fact = 1;
		} else {
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
		}
		return fact;
	}
}