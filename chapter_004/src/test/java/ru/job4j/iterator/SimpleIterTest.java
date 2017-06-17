package ru.job4j.iterator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 17.06.2017.
 */
public class SimpleIterTest {
    @Test
    public void WhenNextThenNext() {
        SimpleIter evenIter = new SimpleIter(new int[]{1,2,3,4,5,6,7,7});
        int temp = -1;
        temp = (int) evenIter.next();

        assertThat(1, is(temp));
    }
}