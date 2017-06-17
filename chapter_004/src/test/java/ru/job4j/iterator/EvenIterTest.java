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

    }


    public void next() {
    EvenIter evenIter = new EvenIter(new int[]{1,2,3,4,5,6,7,7});
    int temp = -1;
    while (evenIter.hasNext()) {
        System.out.println(evenIter.next());
    }
    }

    public static void main(String[] args) {
        new EvenIterTest().next();
    }
}