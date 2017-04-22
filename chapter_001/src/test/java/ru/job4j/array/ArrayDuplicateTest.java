package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* ArrayDuplicateTest  класс теста удаления дубликатов из массива.
* @author romatihsenko
* @since 22.04.2017
* @version 1
*/
public class ArrayDuplicateTest  {
	/**
	* Тест удаления дубликатов из массива.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
       ArrayDuplicate dubl = new ArrayDuplicate();
       String[] array = new String[]{"A", "A", "A", "B", "B", "C"};
       String[] result = dubl.remove(array);
       String[] expected = new String[]{"A", "C", "B"};
       assertThat(result, is(expected));
    }
}