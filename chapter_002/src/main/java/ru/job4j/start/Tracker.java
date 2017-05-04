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
        // тк массив , то нельзя удалять записи
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
     * uodate - не понял , что именно редактировать в записи
     * @param item - запись
     */
    public void update(Item item) {}
}
