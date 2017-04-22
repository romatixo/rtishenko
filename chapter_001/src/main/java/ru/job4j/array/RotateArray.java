package ru.job4j.array;
/**
* RotateArray класс для  переворота  массива.
* @author romatihsenko
* @since 21.04.2017
* @version 1
*/
public class RotateArray {
	/**
	* rotate - метод переворота массива.
	* @param array - исходный массив
	* @return array - перевернутый массив
	*/
	public int[][] rotate(int[][] array) {
		int n = array[0].length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - 1 - i; j++) {
				int temp = array[i][j];
				array[i][j] = array[n - 1 - j][i];
				array[n - 1 - j][i] = array[n - 1 - i][n - 1 - j];
				array[n - 1 - i][n - 1 - j] = array[j][n - 1 - i];
				array[j][n - 1 - i] = temp;
			}
		}
		return array;
	}
}