package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* BubbleSortTest класс теста сортировки массива.
* @author romatihsenko
* @since 21.04.2017
* @version 1
*/
public class BubbleSortTest {
	/**
	* Тест несортированного массива.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       BubbleSort bubble = new BubbleSort();
       int[] array = new int[]{5, 1, 7, 9, 3, -7, 0};
       int[] result = bubble.sort(array);
       int[] expected = new int[]{-7, 0, 1, 3, 5, 7, 9};
       assertThat(result, is(expected));
    }
}