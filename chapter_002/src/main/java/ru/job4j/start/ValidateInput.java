package ru.job4j.start;
/**
 * ValidateInput класс ввода с консоли имеющий обработчик исключений.
 * @author romatihsenko
 * @since 11.05.2017
 * @version 1
 */
public class ValidateInput extends ConsoleInput {
    /**
     * range - range масиива выборов операций.
     */
    public static int[] range = new int[] {0, 1, 2, 3, 4, 5, 6};
    @Override
    public int ask(String question, int[] range) {
        int value = -1;
        boolean flag = true;
        do {
            try {
                value = super.ask(question, range);
                flag = false;
            } catch (MenuOutException moe) {
               System.out.println("Enter valid number of operation.");
            } catch (NumberFormatException nfe) {
                System.err.println("Enter number of operation.");
            }
        } while (flag);
        return value;
    }
}
