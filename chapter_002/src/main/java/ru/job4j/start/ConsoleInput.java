package ru.job4j.start;

import java.util.Scanner;

/**
 * Tracker класс обертки массива записей.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
