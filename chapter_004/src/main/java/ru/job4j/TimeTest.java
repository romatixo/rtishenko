package ru.job4j;

import java.util.*;
/**
 * TimeTest класс проверки времени.
 * @author romatihsenko
 * @since 21.05.2017
 * @version 1
 */
public class TimeTest {
    /**
     * Строка.
     */
    private String line = "";

    /**
     * @param collection - коллекция.
     * @param line - строка
     * @param amount - колво
     * @return  время
     */
    public long add(Collection<String> collection, String line, int amount) {
        long time = System.currentTimeMillis();

        for (int i = 0; i < amount; i++) {
            line += i;
            collection.add(line);
        }
        return System.currentTimeMillis() - time;
    }
    /**
     * @param collection - коллекция.
     * @param amount - колво
     * @return  время
     */
    public long delete(Collection<String> collection, int amount) {
        long time = System.currentTimeMillis();
        Iterator<String> iterator = collection.iterator();
        for (int i = 0; i < amount; i++) {
            if (iterator.hasNext()) {
                 iterator.next();
                iterator.remove();
            }
        }
        return System.currentTimeMillis() - time;
    }

    /**
     * Метод запуска.
     */
    public  void go() {
        Collection<String> linkedlist = new LinkedList<String>();
        Collection<String> arraylist = new ArrayList<String>();
        Collection<String> treeset = new TreeSet<String>();
        long linkedlisttime = this.add(linkedlist, this.line, 5000);
        long arraylisttime = this.add(arraylist, this.line, 5000);
        long treesettime = this.add(treeset, this.line, 5000);
        System.out.println(String.format("Time to add LinkedList : %s\r\nTime to add ArrayList : %s\r\nTime to add TreeSet : %s\r\n",linkedlisttime, arraylisttime, treesettime ));
        linkedlisttime = this.delete(linkedlist,  500);
        arraylisttime = this.delete(arraylist,500);
        treesettime = this.delete(treeset, 500);
        System.out.println(String.format("Time to delete LinkedList : %s\r\nTime to delete ArrayList : %s\r\nTime to delete TreeSet : %s\r\n",linkedlisttime, arraylisttime, treesettime ));

    }

    public static void main(String[] args) {
        new TimeTest().go();
    }
}
