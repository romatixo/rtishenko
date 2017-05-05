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
        Tracker result = new Tracker();

        Item itemOne = new Item("one","desk",1);
        itemOne.setId(itemOne.id);
        expected.add(itemOne);
        result.items[0] = itemOne;
        result.position++;
        assertThat(result, is(expected));
    }
}