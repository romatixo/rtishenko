package ru.job4j.list;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 19.07.2017.
 */
public class StackListTest {
    @Test
    public void whenPushthenAdd() {
        StackList<Integer> stackList = new StackList<>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(5);
        assertThat(5, is(stackList.first.item));
        stackList.pop();
        assertThat(4, is(stackList.first.item));
    }
    @Test
    public void whenIterhenAdd() {
        StackList<Integer> stackList = new StackList<>();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(5);
        Integer result = -1;
        Iterator<Integer> iterator = stackList.iterator();
        while(iterator.hasNext()) {
            result = iterator.next();
        }
        assertThat(1, is(result));
    }
}