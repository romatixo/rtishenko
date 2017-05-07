package ru.job4j.start;
import ru.job4j.models.Item;

import java.util.Arrays;
import java.util.Random;
/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class Tracker {
    /**
     * items - массив заявок
     */
    Item[] items = new Item[100];

    /**
     * Геттер
     * @return position
     */
    public int getPosition() {
        return position;
    }

    /**
     * position - позиция заявки
     */
    private int position = 0;
    /**
     * RN - уникальный id
     */
    private static final Random RN = new Random();
    /**
     * add - метод добавления заявки
     * @param item - заявка
     */
    void add(Item item) {
      item.setId(String.valueOf(RN.nextInt()));
      this.items[position++] = item;
    }
    /**
     * findById - метод поиска записи по id
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
     * delete - метод удаления записи
     * @param item - запись
     */
    void delete(Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].equals(item)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                this.items[position] = null;
                position-=1;
              break;
            }
        }
    }
    /**
     * findAll - показ всех записей
     * @return - показ
     */
    Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    /**
     * findByName - поиск записи по имени
     * @param key - искомое имя
     * @return - записи
     */
    Item[] findByName(String key) {
        int f = 0;
        Item[] result = new Item[position];
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                result[f++] = item;
                f++;
            }
        }
        return Arrays.copyOf(result,f);
    }
    /**
     * update - замена текущей ячейки на тот объект что пришел в методе.
     * @param item - запись
     */
    void update(Item item) {
        for (int i = 0; i<items.length; i++) {
            if (this.items[i].getId().equals(item.getId())) {
               items[i] = item;
               break;
            }
        }
    }
}
