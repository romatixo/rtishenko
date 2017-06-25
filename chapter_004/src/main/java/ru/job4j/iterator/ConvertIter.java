package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * ConvertIter класс итератора итераторов.
 * @author romatihsenko
 * @since 17.06.2017
 * @version 1
 */
public class ConvertIter implements Iterator{
    /**
     * iter - внутренний итератор.
     */
    private Iterator<Integer> iter;
    /**
     * mainiter - итератор итераторов.
     */
    private Iterator<Iterator<Integer>> mainiter;

    /**
     * convert - метод конвертации.
     * @param it - итератор итераторов.
     * @return возвращает класс.
     */
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        this.mainiter = it;
        this.iter = it.next();
        return this;
    }

    /**
     * hasNext - метод проверки существования эл-тов.
     * @return логическое значение.
     */
    @Override
    public boolean hasNext() {
        return iter.hasNext() || mainiter.hasNext();
    }

    /**
     * next - метод , который отдаёт текущий эл-т.
     * @return
     */
    @Override
    public Integer next() {
        Integer result = 0;
        if (iter.hasNext()) {
            result = iter.next();
        } else if (mainiter.hasNext()) {
            iter = mainiter.next();
            result = iter.next();
        } else {
            throw new NoSuchElementException();
        }
        return result;
    }
}
