package ru.job4j.brackets;
/**
 * Brackets класс скобок.
 * @author romatihsenko
 * @since 21.05.2017
 * @version 1
 */
public class Brackets {
    /**
     * @param str - входная строка.
     * @return - результат
     */
    boolean find(String str) {
        boolean flag = false;
        char[] st = str.toCharArray();
        int count = 0;
        for (int i = 0; i < st.length; i++) {
            if (st[0]==')') {
                count++;
                break;
            }
            if (st[i] == ')' && count == 0) {
                count--;
                break;
            } else if (st[i] == '(') {
                count += 1;
            } else if (st[i] == ')' && count != 0) {
                count -= 1;
            }
        }
        if (count == 0) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Brackets brackets = new Brackets();
        System.out.println(brackets.find("(())())"));

    }
}
