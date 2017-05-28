package ru.job4j.start;
import ru.job4j.models.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class Tracker {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tracker tracker = (Tracker) o;

        return items != null ? items.equals(tracker.items) : tracker.items == null;
    }

    @Override
    public int hashCode() {
        return items != null ? items.hashCode() : 0;
    }

    /**
     * Геттер.
     * @return items
     */
    public ArrayList<Item> getItems() {
        return items;
    }
    /**
     * items - массив заявок.
     */
    private ArrayList<Item> items = new ArrayList<>();
    /**
     * RN - уникальный id.
     */
    private static final Random RN = new Random();
    /**
     * add - метод добавления заявки.
     * @param item - заявка
     */
    void add(Item item) {
      item.setCreate(System.currentTimeMillis());
      this.items.add(item);
    }
    /**
     * findById - метод поиска записи по id.
     * @param id - id записи
     * @return - искомая запись
     */
    Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * delete - метод удаления записи.
     * @param item - запись
     */
    void delete(Item item) {
        for (Item value : this.items) {
            if (value.equals(item)) {
                this.items.remove(value);
              break;
            }
        }
    }
    /**
     * findAll - показ всех записей.
     * @return - показ
     */
    ArrayList<Item> findAll() {
        return this.items;
    }
    /**
     * findByName - поиск записи по имени.
     * @param key - искомое имя
     * @return - записи
     */
    ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }
    /**
     * update - замена текущей ячейки на тот объект что пришел в методе.
     * @param item - запись
     */
    void update(Item item) {
        int i = 0;
        for (Item value : items) {
            if (value.getId().equals(item.getId())) {
               items.set(i, item);
               break;
            }
            i++;
        }
    }
}
