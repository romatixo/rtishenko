package ru.job4j.convertmap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class UserConvert {

    class User {
        private int id;
        private String name;
        private String city;

        public int getId() {
            return id;
        }
    }

    /**
     * @param list - входной лист.
     * @return полученная map
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User user : list) {
            map.put(user.getId(), user);
        }
        return map;
    }
}
