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
			for (int j = 0; j < n - j; j++) {
				if (array[i].equals(array[j]) && j != i) {
					// поменять j с концом - j
					String temp = array[j];
					array[j] = array[n - j];
					array[n - j] = array[j];
					score++;
				}
			}
		}
		return Arrays.copyOf(array, score);
	}
}