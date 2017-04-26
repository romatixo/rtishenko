package ru.job4j.loop; 
/** 
* Class для слияния двух массивов. 
* @author rtishenko 
* @since 25.04.2017 
* @version 1 
*/ 
public class Cntr { 
/** 
* Method to sort and copy array. 
* @param firstArray - first sorted array 
* @param secondArray - second sortedArray 
* @return sorted array 
*/ 
public int[] conc(int[] firstArray, int[] secondArray) { 
	int j, i = 0; 
	int[] newArray = new int[firstArray.length + secondArray.length]; 
	while (j < secondArray.length && i < firstArray.length) { 
		newArray[i + j] = firstArray[i] < secondArray[j] ? firstArray[i++] : secondArray[j++]; 
	} 
	while (j < secondArray.length) { 
		newArray[i + j] = secondArray[j++]; 
	} 
	while (i < firstArray.length) { 
	newArray[i + j] = secondArray[i++]; 
	} 
	return newArray; 
	} 
}