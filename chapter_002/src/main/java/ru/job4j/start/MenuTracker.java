package ru.job4j.start;

import ru.job4j.models.Item;
/**
 * Update класс операции edit.
 * @author romatihsenko
 * @since 11.05.2017
 * @version 1
 */
class Update implements UserAction {
    /**
     * key - вывод ключа операции.
     * @return 2
     */
    @Override
    public int key() {
        return 2;
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

    /**
     * info - информация.
     * @return - инфо операции
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit item.");
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
        this.actions[0] = new AddItem();
        this.actions[1] = new FindAll();
        this.actions[2] = new Update();
        this.actions[3] = new Delete();
        this.actions[4] = new FindById();
        this.actions[5] = new FindByName();
        this.actions[6] = new Exit();

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
    private class AddItem implements UserAction {

        /**
         * key - вывод ключа операции.
         * @return 0
         */
        @Override
        public int key() {
            return 0;
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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new Item.");
        }
    }
    /**
     * Класс операции findAll.
     */
    private static class FindAll implements UserAction {

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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all Items.");
        }
    }
    /**
     * Класс операции delete.
     */
    private class Delete implements UserAction {

        /**
         * key - вывод ключа операции.
         * @return 3
         */
        @Override
        public int key() {
            return 3;
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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Delete item.");
        }
    }
    /**
     * Класс операции findById.
     */
    private class FindById implements UserAction {

        /**
         * key - вывод ключа операции.
         * @return 4
         */
        @Override
        public int key() {
            return 4;
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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Id.");
        }
    }
    /**
     * Класс операции findByName.
     */
    private class FindByName implements UserAction {

        /**
         * key - вывод ключа операции.
         * @return 5
         */
        @Override
        public int key() {
            return 5;
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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Find item by Name.");
        }
    }
    /**
     * Класс операции exit.
     */
    private class Exit implements UserAction {

        /**
         * key - вывод ключа операции.
         * @return 6
         */
        @Override
        public int key() {
            return 6;
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
        /**
         * info - информация.
         * @return - инфо операции
         */
        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Exit Program.");
        }
    }
}
