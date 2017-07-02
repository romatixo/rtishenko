package ru.job4j.generic;
/**
 * SimpleArray класс реализации обобщений для массива.
 * @author romatihsenko
 * @since 2.07.2017
 * @version 1
 */
public class SimpleArray <T> {
    int possition = 0;
    Object[] arr;

    public SimpleArray(int size) {
        this.arr = new Object[size];
    }

    /**
     * add - method adding el-t.
     * @param value - param.
     */
    public void add(T value) {
        this.arr[possition++] = value;
    }

    /**
     * get - method geting value by index.
     * @param index - index value.
     * @return value of array.
     */
    public T get(int index) {
        return (T)this.arr[index];
    }

    /**
     * update - method updating data of array el-t.
     * @param index - position cell.
     * @param value - value for update.
     */
    public void update(int index, Object value) {
        this.arr[index] = value;
    }

    /**
     * delete - method deleting cell by index.
     * @param index - position cell.
     */
    public void delete(int index) {
        if (index == this.arr.length - 1) {
            this.arr[index] = null;
            possition--;
        } else {
            while(index + 1 != possition) {
                Object temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
                index++;
            }
            possition--;
        }
    }
}
