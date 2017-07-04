package ru.job4j.generic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * Created by Рома on 02.07.2017.
 */
public class SimpleArrayTest {
    @Test
    public void add() throws Exception {
        SimpleArray<Integer> list = new SimpleArray<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertThat(4, is(list.get(3)));
    }


    @Test
    public void update() throws Exception {
        SimpleArray<String> list = new SimpleArray<>(10);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.update(0, 15);
        assertThat(15,is(list.get(0)));
    }

    @Test
    public void delete() throws Exception {
        SimpleArray<Double> list = new SimpleArray<>(10);
        list.add(1.1);
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        list.delete(0);
        list.delete(0);
        assertThat(1.3, is(list.get(0)));
        assertThat(2,is(list.possition));
    }

}