package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TrackerTest класс теста трекера.
 * @author romatihsenko
 * @since 05.05.2017
 * @version 1
 */
public class TrackerTest {
    /**
     * Тест проверки метода add.
     */
    @Test
    public void whenOneThenTwo() {
        Tracker expected = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        expected.add(itemOne);

        assertThat(itemOne, is(expected.getItems().get(0)));
    }
    /**
     * Тест проверки метода findById.
     */
    @Test
    public void whenOneThenThree() {
        Tracker expected = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        expected.add(itemOne);
        Item res = expected.findById(itemOne.getId());
        assertThat(itemOne, is(res));
    }
    /**
     * Тест проверки метода delete.
     */
    @Test
    public void whenOneThenFour() {
        Tracker expected = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        Item itemTwo = new Item("one1", "desk1", "2");
        expected.add(itemOne);
        expected.add(itemTwo);
        expected.delete(itemTwo);

        assertThat(null, is(expected.findById(itemTwo.getId())));
    }
    /**
     * Тест проверки метода findAll.
     */
    @Test
    public void whenOneThenFive() {
        Tracker expected = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        expected.add(itemOne);
        assertThat(itemOne, is(expected.findAll().get(0)));
    }
    /**
     * Тест проверки метода findByName.
     */
    @Test
    public void whenOneThenSix() {
        Tracker expected = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        expected.add(itemOne);
        Item[] items = new Item[1];
        items[0] = itemOne;
        assertThat(items, is(expected.findByName(itemOne.getName())));
    }
    /**
     * Тест проверки метода update.
     */
    @Test
    public void whenOneThenSeven() {
        Tracker expected = new Tracker();
        Tracker result = new Tracker();
        Item itemOne = new Item("one", "desk", "1");
        expected.add(itemOne);
        itemOne.setName("one1");
        result.add(itemOne);
        expected.update(itemOne);
        assertThat(itemOne, is(expected.getItems().get(0)));
    }
}