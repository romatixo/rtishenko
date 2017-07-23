package ru.job4j.list;

/**
 * Created by Рома on 23.07.2017.
 */
class NodeList<T>  {
    public NodeList(T value) {
        this.value = value;
    }
    T value;
    NodeList<T> next;
}

public class CycleList<T> {
    /**
     * Method for definition of cyclical turns.
     * @param first point.
     * @return result.
     */
    boolean hasCycle(NodeList<T> first) {
        boolean result = false;
        NodeList<T> current = first.next;
        NodeList<T> spot = first;
        while (current.next != null && result != true) {
            current = current.next;
            if (current == spot) {
                result = true;
            }
        }
        return result;
    }
}

