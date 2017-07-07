package ru.job4j.generic;
/**
 * SimpleArray класс реализации обобщений для массива.
 * @author romatihsenko
 * @since 2.07.2017
 * @version 1
 */
public class SimpleArray <T extends Base> {
    int possition = 0;
    T[] arr;

    public SimpleArray(T[] mass) {
        this.arr = mass;
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
        return this.arr[index];
    }

    /**
     * update - method updating data of array el-t.
     * @param id  - id.
     * @param value - value for update.
     */
    public void update(String id, T value) {
        for (T temp : arr) {
            if (temp.getId().equals(value.getId())) {
                temp.setId(id);
                break;
            }
        }
    }

    /**
     * delete - method deleting cell by index.
     * @param id - id.
     */
    public void delete(String id) {
        int tempindex = 0;
        for (T temp : arr) {
        tempindex++;
            if (temp.getId().equals(id)) {
                System.arraycopy(this.arr, tempindex + 1,this.arr, tempindex,this.arr.length - possition);
                break;
            }
        }

        possition--;
    }
}
