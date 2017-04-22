package ru.job4j.array;
/**
* BubbleSort класс для  сортировки массива.
* @author romatihsenko
* @since 21.04.2017
* @version 1
*/
public class BubbleSort {
	/**
	* sort - метод сортировки массива.
	* @param array - исходный массив
	* @return array - отсортированный массив
	*/
	public int[] sort(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}