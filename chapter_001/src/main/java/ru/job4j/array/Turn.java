package ru.job4j.array;
/**
* Turn класс для переворота массива.
* @author romatihsenko
* @since 20.04.2017
* @version 1
*/
public class Turn {
	/**
	* back - метод разворота массива.
	* @param array - исходный массив
	* @return array - массив
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int c;
			c = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = c;
		}
		return array;
	}
}