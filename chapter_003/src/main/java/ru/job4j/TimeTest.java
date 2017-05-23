package ru.job4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;


public class TimeTest {
    private String line = "QWDIQWNHD";

    public long add(Collection<String> collection, String line, int amount) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.add(line);
        }
        return System.currentTimeMillis() - time;
    }

    public long delete(Collection<String> collection, int amount) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.remove(this.line);
        }

        return System.currentTimeMillis() - time;
    }

    public  void go() {
        Collection<String> linkedlist = new LinkedList<String>();
        Collection<String> arraylist = new ArrayList<String>();
        Collection<String> treeset = new TreeSet<String>();
        long linkedlisttime = this.add(linkedlist, this.line, 500000);
        long arraylisttime = this.add(arraylist, this.line, 500000);
        long treesettime = this.add(treeset, this.line, 500000);
        System.out.println(String.format("Time to add LinkedList : %s\r\nTime to add ArrayList : %s\r\nTime to add TreeSet : %s\r\n",linkedlisttime, arraylisttime, treesettime ));
        linkedlisttime = this.delete(linkedlist,  500000);
        arraylisttime = this.delete(arraylist,500000);
        treesettime = this.delete(treeset, 500000);
        System.out.println(String.format("Time to delete LinkedList : %s\r\nTime to delete ArrayList : %s\r\nTime to delete TreeSet : %s\r\n",linkedlisttime, arraylisttime, treesettime ));

    }

    public static void main(String[] args) {
        new TimeTest().go();
    }
}
