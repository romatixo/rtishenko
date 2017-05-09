package ru.job4j.start;
import ru.job4j.models.Item;
/**
 * StartUI класс программы.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class StartUI {
    /**
     * input - вариант ввода.
     */
    private Input input;
    /**
     * tracker - вариант реализации хранения данных.
     */
    private Tracker tracker;
    /**
     * Конструктор.
     * @param input - ввод
     * @param tracker - хранение
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * ADD - добавить.
     */
    private static final int ADD = 0;
    /**
     * FINDALL - вывести все записи.
     */
    private static final int FINDALL = 1;
    /**
     * UPDATE - обновить.
     */
    private static final int UPDATE = 2;
    /**
     * DELETE - удалить.
     */
    private static final int DELETE = 3;
    /**
     * FINDID - найти по ID.
     */
    private static final int FINDID = 4;
    /**
     * FINDNAME - найти по NAME.
     */
    private static final int FINDNAME = 5;
    /**
     * EXIT - выход.
     */
    private static final int EXIT = 6;

    /**
     * Метод работы с меню.
     */
    public void init() {
        boolean flag = false;
        while (!flag) {
            viewMenu();
            int answer = Integer.valueOf(input.ask("Select:"));
            if (answer == ADD) {
                Item item = new Item(input.ask("Введите  имя пользователя"), input.ask("Теперь введите описание заявки"), input.ask("Введите Id заявки"));
                tracker.add(item);
            } else if (answer == FINDALL) {
                int i = 1;
                for (Item item1 : tracker.findAll()) {
                    System.out.println("  Заявка № " + i);
                    System.out.println(item1.toString());
                    i++;
                }
            } else if (answer == UPDATE) {
                String id = input.ask("Введите id записи , которую вы хотите изменить");
                Item item = tracker.findById(id);
                if (item != null) {
                    item.setName(input.ask("Измените имя заявки"));
                    item.setDescription(input.ask("Измените описание заявки"));
                    tracker.update(item);
                } else {
                    System.out.println("Такой записи не существует");
                }
            } else if (answer == DELETE) {
                String id = input.ask("Введите id записи , которую вы хотите удалить");
                Item item = tracker.findById(id);
                if (item != null) {
                    tracker.delete(item);
                } else {
                    System.out.println("Такой записи не существует");
                }
            } else if (answer == FINDID) {
                String id = input.ask("Введите id записи , которую вы хотите найти");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.toString());
                }  else {
                    System.out.println("Такой записи не существует");
                }
            } else if (answer == FINDNAME) {
                String name = input.ask("Введите name записи , которую вы хотите найти");
                Item[] items = tracker.findByName(name);
                if (items != null) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i].toString());
                    }
                }  else {
                    System.out.println("Такой записи не существует");
                }
            } else if (answer == EXIT) {
               flag = true;
            }
        }
    }
    /**
     * viwMenu - меню.
     */
    public void viewMenu() {
        String[] menu = new String[] {"0. Add new Item", "1. Show all items", "2. Edit item", "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit Program"};
        for (String part : menu) {
            System.out.println(part);
        }
    }
     /**
     * main - главный метод.
     * @param args - арг
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
