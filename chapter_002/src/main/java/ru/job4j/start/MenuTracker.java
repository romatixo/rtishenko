package ru.job4j.start;

import ru.job4j.models.Item;
/**
 * Update класс операции edit.
 * @author romatihsenko
 * @since 11.05.2017
 * @version 1
 */
class Update extends BaseAction {
    public Update(String name, int key) {
        super(name,2);
    }

    /**
     * execute - выполнение операции.
     * @param input   - ввод
     * @param tracker - трэкер
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please, enter the task's id.");
        Item item = tracker.findById(id);
        if (item != null) {
            item.setName(input.ask("Измените имя заявки"));
            item.setDescription(input.ask("Измените описание заявки"));
            tracker.update(item);
        } else {
            System.out.println("Такой записи не существует");
        }
    }

}
/**
 * MenuTracker класс меню программы.
 * @author romatihsenko
 * @since 11.05.2017
 * @version 1
 */
public class MenuTracker {
    /**
     * input - реализация ввода.
     */
    private Input input;
    /**
     * tracker - реализация трекера.
     */
    private Tracker tracker;
    /**
     * actions - массив операций.
     */
    private UserAction[] actions = new UserAction[7];

    /**
     * MenuTracker - конструктор.
     * @param input - ввод
     * @param tracker - трэкер
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Занесение в массив операций.
     */
    public void fillActions() {
        this.actions[0] = new AddItem("Add Item", 0);
        this.actions[1] = new FindAll("Find All Items", 1);
        this.actions[2] = new Update("Update Item", 2);
        this.actions[3] = new Delete("Delete item", 3);
        this.actions[4] = new FindById("Find item by id", 4);
        this.actions[5] = new FindByName("Find item by name", 5);
        this.actions[6] = new Exit("Exit programm", 6);

    }

    /**
     * Вывод на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }

        }
    }

    /**
     * @param key - ключ операции.
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    /**
     * Класс операции add.
     */
    private class AddItem extends BaseAction {
        public AddItem(String name, int key) {
            super(name, key);
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name.");
            String desc = input.ask("Please, enter the task's desk.");
            String id = input.ask("Please, enter the task's id.");
            tracker.add(new Item(name, desc, id));
        }
    }
    /**
     * Класс операции findAll.
     */
    private static class FindAll extends BaseAction {

        public FindAll(String name, int key) {
            super(name, key);
        }
        /**
         * key - вывод ключа операции.
         * @return 1
         */
        @Override
        public int key() {
            return 1;
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            int i = 1;
            if (tracker.findAll().length != 0) {
                for (Item item1 : tracker.findAll()) {
                System.out.println("  Заявка № " + i);
                System.out.println(item1.toString());
                i++;
            }
            } else {
                System.out.println("Список заявок пуст");
            }

        }
    }
    /**
     * Класс операции delete.
     */
    private class Delete extends BaseAction {

        public Delete(String name, int key) {
            super(name, key);
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id записи , которую вы хотите удалить");
            Item item = tracker.findById(id);
            if (item != null) {
                tracker.delete(item);
            } else {
                System.out.println("Такой записи не существует");
            }
        }
    }
    /**
     * Класс операции findById.
     */
    private class FindById extends BaseAction {

        public FindById(String name, int key) {
            super(name, key);
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id записи , которую вы хотите найти");
            Item item = tracker.findById(id);
            if (item != null) {
                System.out.println(item.toString());
            }  else {
                System.out.println("Такой записи не существует");
            }
        }
    }
    /**
     * Класс операции findByName.
     */
    private class FindByName extends BaseAction {

        public FindByName(String name, int key) {
            super(name, key);
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите name записи , которую вы хотите найти");
            Item[] items = tracker.findByName(name);
            if (items != null) {
                for (int i = 0; i < items.length; i++) {
                    System.out.println("Запись номер : " + (i + 1) + "\r\n" + items[i].toString());
                }
            }  else {
                System.out.println("Такой записи не существует");
            }
        }
    }
    /**
     * Класс операции exit.
     */
    private class Exit extends BaseAction {

        public Exit(String name, int key) {
            super(name, key);
        }
        /**
         * execute - выполнение операции.
         * @param input   - ввод
         * @param tracker - трэкер
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            StartUI.flag = true;
        }

    }
}
