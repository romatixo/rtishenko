package ru.job4j.start;
/**
 * StubInput класс inouta.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class StubInput implements Input {
    private String[] answer;
    private int position = 0;
    public StubInput(String[] answer) {
        this.answer = answer;
    }
    @Override
    public String ask(String question) {
        return answer[position++];
    }

    @Override
    public int ask(String question, int[] range) {
        return 0;
    }
}
