package ru.job4j.list;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 11.07.2017.
 */
public class ContainerOnTheListTest {
    @Test
    public void TestContList() {
        ContainerOnTheList<Integer> list = new ContainerOnTheList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertThat(4, is(list.get(3)));
        Iterator<Integer> iterator = list.iterator();
        Integer result = -1;
        while (iterator.hasNext()) {
            result = iterator.next();
        }
        assertThat(4,is(result));
    }

}