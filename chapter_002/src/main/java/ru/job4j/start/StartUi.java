package ru.job4j.start;

import ru.job4j.models.Item;

/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class StartUi {

    public void init() {

        Tracker tracker = new Tracker();
        ConsoleInput consoleInput = new ConsoleInput();
        while (true) {
            viewMenu();
            String answer = consoleInput.ask("Select:");
            if (answer.equals("0")) {
                Item item = new Item(consoleInput.ask("Введите  имя пользователя")
                        ,consoleInput.ask("Теперь введите описание заявки"), System.currentTimeMillis());
                tracker.add(item);

            }
            else if (answer.equals("1")) {
                int i = 1;
                for (Item item1 : tracker.findAll()) {
                    System.out.println("  Заявка № "+ i);
                    System.out.println("Название : " + item1.getName());
                    System.out.println("Описание : " + item1.getDescription());
                    System.out.println("Id : " + item1.getId());
                    System.out.println("Дата создания : " + item1.getCreate());
                    i++;
                }

            }
            else if (answer.equals("2")) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите изменить");
                Item item = tracker.findById(id);
                if (item != null) {
                    item.setName(consoleInput.ask("Измените имя заявки"));
                    item.setDescription(consoleInput.ask("Измените описание заявки"));
                    tracker.update(item);
                } else
                    System.out.println("Такой записи не существует");

            }
             else if (answer.equals("3")) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите удалить");
                Item item = tracker.findById(id);
                if (item != null) {
                    tracker.delete(item);
                } else
                    System.out.println("Такой записи не существует");
            }
            else if (answer.equals("4")) {
                String id = consoleInput.ask("Введите id записи , которую вы хотите найти");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Заявка : " + item.getName());
                    System.out.println("Описание : " + item.getDescription());
                } else
                    System.out.println("Такой записи не существует");
            }
             else if (answer.equals("5")) {
                String name = consoleInput.ask("Введите name записи , которую вы хотите найти");
                int l = 0;
                Item[] items = tracker.findByName(name);
                if (items != null) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println("Заявка : " + items[i].getName());
                        System.out.println("Описание : " + items[i].getDescription());
                    }
                } else
                    System.out.println("Таких записей не существует");
            }
            else if (answer.equals("6")) {
                break;
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
        new StartUi().init();
    }
}
