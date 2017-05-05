package ru.job4j.start;
import ru.job4j.models.Item;
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
    private Item[] items = new Item[100];
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
    public void add(Item item) {
      item.setId(String.valueOf(RN.nextInt()));
      this.items[position++] = item;
    }
    /**
     * findById - метод поиска записи по id
     * @param id - id записи
     * @return - искомая запись
     */
    protected  Item findById(String id) {
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
    public void delete (Item item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].equals(item)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i);
              break;
            }
        }
    }
    /**
     * findAll - показ всех записей
     * @return - показ
     */
    public Item[] findAll() {
        Item[] result = new Item[10];
        System.arraycopy(this.items, 0, result, 0, 100);
        return result;
    }
    /**
     * findByName - поиск записи по имени
     * @param key - искомое имя
     * @return - записи
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[100];
        int i = 0;
        for (Item item : this.items) {
            if (item.getName().equals(key)) {
                result[i++] = item;
            }
        }
        return result;
    }
    /**
     * update - замена текущей ячейки на тот объект что пришел в методе.
     * @param item - запись
     */
    public void update(Item item) {
        this.items[position] = item;
    }
}
