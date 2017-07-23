package ru.job4j.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 23.07.2017.
 */
public class CycleListTest {

@Test
    public void asdasd() {
    NodeList<Integer> first = new NodeList(1);
    NodeList<Integer> two = new NodeList(2);
    NodeList<Integer> third = new NodeList(3);
    NodeList<Integer> four = new NodeList(4);

    first.next = two;
    two.next = third;
    third.next = four;
    four.next = first;
    CycleList<Integer> list = new CycleList<>();
    assertThat(true, is(list.hasCycle(first)));
    }

}