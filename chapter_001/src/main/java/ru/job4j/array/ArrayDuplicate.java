package ru.job4j.array;
import java.util.Arrays;
/**
*  ArrayDuplicate класс для  удаления дубликатов из массива.
* @author romatihsenko
* @since 22.04.2017
* @version 1
*/
public class  ArrayDuplicate {
	/**
	* romove - метод удаления дубликатов массива.
	* @param array - исходный массив
	* @return array - отсортированный массив
	*/
	public String[] remove(String[] array) {
		int n = array.length;
		int score = 0;
		for (int i = 0; i < n - score; i++) {
			for (int j = 0; j < n - score; j++) {
				if (array[i].equals(array[j]) && j != i) {
					for (int f = j; f < n - 1; f++) {
					   String temp = array[f];
						array[f] = array[f + 1];
						array[f + 1] = temp;
					}
					score++;
				}
			}
		}
		return Arrays.copyOf(array, score);
	}
}