package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* RotateArrayTest  класс теста переворота массива.
* @author romatihsenko
* @since 21.04.2017
* @version 1
*/
public class RotateArrayTest  {
	/**
	* Тест несортированного массива.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       RotateArray rot = new RotateArray();
       int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
       int[][] result = rot.rotate(array);
       int[][] expected = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
       assertThat(result, is(expected));
    }
	/**
	* Тест несортированного массива.
	*/
    @Test
    public void when2SortArrayWithTenElementsThenSortedArray() {
       RotateArray rot = new RotateArray();
       int[][] array = new int[][]{{1, 2}, {3, 4}};
       int[][] result = rot.rotate(array);
       int[][] expected = new int[][]{{3, 1}, {4, 2}};
       assertThat(result, is(expected));
    }
}