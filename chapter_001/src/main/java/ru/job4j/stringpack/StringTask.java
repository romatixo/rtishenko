package ru.job4j.stringpack;
/**
*  StringTask класс для  удаления дубликатов из массива.
* @author romatihsenko
* @since 23.04.2017
* @version 1
*/
public class  StringTask {
	/**
	* contains - метод удаления дубликатов массива.
	* @param origin - исходная строка
	* @param sub - подстрока
	* @return flag - знак наличия или отсутствия подстроки в строке
	*/
	public boolean contains(String origin, String sub) {
		char[] originArr = origin.toCharArray();
		char[] subArr = sub.toCharArray();
		int lengthOrigin = origin.length();
		int lengthSub = sub.length();
		boolean flag = false;
		int count = 0;
		for (int i = 0; i <= lengthOrigin - lengthSub; i++) {
			if (subArr[0] == originArr[i]) {
				int j = 0;
				while (j < lengthSub && subArr[j] == originArr[i]) {
					j++;
					i++;
				}
				if (j == lengthSub) {
					flag = true;
				}
			}
		}

		return flag;
	}
}