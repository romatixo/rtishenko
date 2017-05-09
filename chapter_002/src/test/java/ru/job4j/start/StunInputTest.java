package ru.job4j.start;

import org.junit.Test;
import ru.job4j.models.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * StunInputTest класс теста меню.
 * @author romatihsenko
 * @since 09.05.2017
 * @version 1
 */
public class StunInputTest {
    /**
     * Тест проверки метода add.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Тест проверки метода delete.
     */
    @Test
    public void whenUserFindAllItemThenTrackerHasItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "0","test name2", "desc2", "2", "3", "2","6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().length, is(1));
    }
    /**
     * Тест проверки метода Update.
     */
    @Test
    public void whenUserUpdateItemThenTrackerHasUpdateItemWithNewName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1", "2", "1", "test nameUp", "descNew", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test nameUp"));
    }
    /**
     * Тест проверки метода findById
     */
    @Test
    public void whenUserFindByIdThenTrackerHasItemWithEnteredId() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1",  "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById("1").getName(), is("test name"));
    }
    /**
     * Тест проверки метода findByName.
     */
    @Test
    public void whenUserFindByNameThenTrackerHasItemWithEnteredName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "1",  "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("test name")[0].getName(), is("test name"));
    }

}

