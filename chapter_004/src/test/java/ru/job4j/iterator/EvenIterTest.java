package ru.job4j.iterator;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 12.06.2017.
 */
public class EvenIterTest {
    @Test
    public void hasNext() throws Exception {
        EvenIter evenIter = new EvenIter(new int[]{1,2,3,4,5,6,7,7});
        int temp = -1;
        temp = evenIter.next();
        temp = evenIter.next();
        assertThat(4, is(temp));
    }
}