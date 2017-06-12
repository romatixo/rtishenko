package ru.job4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Рома on 05.06.2017.
 */
public class SortCorp {
    public void sortRise(String[] mass) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, mass);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < o1.length() - 1 && i < o2.length() - 1;  i++) {
                    if (o1.charAt(i) == '\\' || o2.charAt(i) == '\\') {
                        if (o1.charAt(i - 1) > o2.charAt(i - 1)) {
                               String temp = o1;
                               list.set(list.indexOf(o2), temp);
                        }
                    }
                }

                return 0;
            }
        });
    }

}
