package ru.job4j.stringpack;
/**
* СontrolTask класс для  удаления дубликатов из массива.
* @author romatihsenko
* @since 25.04.2017
* @version 1
*/
public class ControlTask {
	/**
	* conc - метод
	* @param - 1 параметр
	* @param - 2 параметр
	* @return - результат
	*/
	public int[] conc(int[] arrayone, int[] arraytwo) {
		int[] array = new int[arrayone.length + arraytwo.length];
		int j, g = 0;
		for (int i = 0; i < arrayone.length + arraytwo.length; i++) {
			while (j + g < array.length - 2) {
				if (arrayone[j] <= arraytwo[g]) {
					array[i] = arrayone[j];
					j++;
					break;
				} else {
					array[i] = arraytwo[g];
					g++;
					break;
				}
			}
		}
		return array;
	}
}