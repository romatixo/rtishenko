package ru.job4j.start;

import java.util.Scanner;
/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class ConsoleInput implements Input {
    /**
     * scanner - чтение с клавиатуры.
     */
    private Scanner scanner = new Scanner(System.in);
    /**
     * ask - спрошивает у пользователя вопрос.
     * @param question - вопрос
     * @return - строка
     */
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    /**
     * @param question - вопрос
     * @param range    - range значений
     * @return-  0
     */
    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu");
        }
    }
}
