package ru.job4j.start;

import ru.job4j.models.Item;

/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class StartUi {
    private Input input;
    private Tracker tracker;
    public StartUi(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    private static final int ADD = 0;
    private static final int FINDALL = 1;
    private static final int UPDATE = 2;
    private static final int DELETE = 3;
    private static final int FINDID = 4;
    private static final int FINDNAME = 5;
    private static final int EXIT = 6;

    public void init() {

        Tracker tracker = new Tracker();
        ConsoleInput consoleInput = new ConsoleInput();
        boolean flag = false;
        while (!flag) {
            viewMenu();
            int answer = Integer.valueOf(consoleInput.ask("Select:"));
            if (answer==ADD) {
                Item item = new Item(consoleInput.ask("Введите  имя пользователя")
                        ,consoleInput.ask("Теперь введите описание заявки"), System.currentTimeMillis());
                tracker.add(item);

            }
            else if (answer==FINDALL) {
                int i = 1;
                for (Item item1 : tracker.findAll()) {
                    System.out.println("  Заявка № "+ i);
                    System.out.println(item1.toString());
                    i++;
                }

            }
            else if (answer==UPDATE) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите изменить");
                Item item = tracker.findById(id);
                if (item != null) {
                    item.setName(consoleInput.ask("Измените имя заявки"));
                    item.setDescription(consoleInput.ask("Измените описание заявки"));
                    tracker.update(item);
                } else
                    System.out.println("Такой записи не существует");

            }
             else if (answer==DELETE) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите удалить");
                Item item = tracker.findById(id);
                if (item != null) {
                    tracker.delete(item);
                } else
                    System.out.println("Такой записи не существует");
            }
            else if (answer==FINDID) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите найти");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.toString());
                } else
                    System.out.println("Такой записи не существует");
            }
             else if (answer==FINDNAME) {
                String name = consoleInput.ask("Введите name записи , которую вы хотите найти");
                int l = 0;
                Item[] items = tracker.findByName(name);
                if (items != null) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i].toString());
                    }
                } else
                    System.out.println("Таких записей не существует");
            }
            else if (answer==EXIT) {
               flag = true;
            }
        }
    }
    public void viewMenu() {
        String[] menu = new String[] {"0. Add new Item","1. Show all items",
                "2. Edit item", "3. Delete item","4. Find item by Id",
                "5. Find items by name","6. Exit Program"};
        for (String part : menu) {
            System.out.println(part);
        }
    }

    public static void main(String[] args) {
        new StartUi(new ConsoleInput(),new Tracker()).init();
    }
}
