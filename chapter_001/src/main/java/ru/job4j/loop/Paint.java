package ru.job4j.loop;
/**
* Paint класс для псевдорисования пирамиды.
* @author romatihsenko
* @since 19.04.2017
* @version 1
*/
public class Paint {
/**
	* piramid - метод псевдорисования пирамиды .
	* @param h - высота пирамиды
	* @return пирамиду
	*/
	public String piramid(int h) {
		String pir = "";
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < (2 * h - 1); j++) {
				if (j < (h - i - 1) || j > (h + i - 1)) {
					pir = pir + " ";
				} else {
					pir = pir + "^";
				}
			}
			if (i != h - 1) {
				pir = pir + String.format("%s", System.getProperty("line.separator"));
			}
		}
		return pir;
	}
}