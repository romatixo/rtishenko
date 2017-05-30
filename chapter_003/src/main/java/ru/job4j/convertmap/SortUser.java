package ru.job4j.convertmap;

/**
 * SortUser класс .
 * @author romatihsenko
 * @since 30.05.2017
 * @version 1
 */
import java.util.*;

public class SortUser {

    class User implements Comparable<User> {
        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        private Integer age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            return age == user.age;
        }

        @Override
        public int hashCode() {
            int result = age != null ? age.hashCode() : 0;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(User o) {
            return this.age.compareTo(o.age);
        }
    }
    public List<User> sortHash (List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return new Integer(o1.hashCode()).compareTo(new Integer(o2.hashCode()));
            }
        });
        return list;
    }
    public List<User> sortLength (List<User> list) {
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.length() < o2.name.length() ? o1.name.length() :  o2.name.length();
            }
        });
        return list;
    }

    /**
     * @param list - входной лист.
     * @return - выходной сет.
     */
    public Set<User> sort(List<User> list) {
        TreeSet<User> set = new TreeSet<>();
        for (User user : list) {
            set.add(user);
        }
        return set;
    }
    /**
     * @param list - входной лист.
     * @return полученная map
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User user : list) {
            map.put(user.getAge(), user);
        }
        return map;
    }

    public void go () {
        List<User> list = new ArrayList<>();
        User user1 = new User(19, "Tom");
        User user2 = new User(11, "Ned");
        User user3 = new User(22, "Koll");
        User user4 = new User(3, "Sara");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        Set<User> set = sort(list);
        list = sortLength(list);
        for (User user :
                list) {
            System.out.println(user);
        };
    }
    public static void main(String[] args) {
        new SortUser().go();
    }
}
