package ru.job4j.iterator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author rtishenko.
 * 12.06.2017
 */
public class MatrIterTest {

    public void whenOneTwothenTrue(){
        MatrIter matrIter = new MatrIter(new int[][] {{1,2}, {3,4}});
        int temp = -1;
        temp = matrIter.next();
        boolean f = false;
        f = matrIter.hasNext();
        temp = matrIter.next();
        f = matrIter.hasNext();
        temp = matrIter.next();
        f = matrIter.hasNext();
        temp = matrIter.next();
        f = matrIter.hasNext();
        System.out.println(temp + " " + f);
    }

    public static void main(String[] args) {
        new MatrIterTest().whenOneTwothenTrue();
    }
}