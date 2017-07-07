package ru.job4j.generic;

/**
 * Created by Рома on 05.07.2017.
 */
public class Role extends Base {
    /**
     * id -id.
     */
    private String id;

    public Role(String id) {
        this.id = id;
    }
    /**
     * getId - getter.
     * @return
     */
    @Override
    public String getId() {
        return this.id;
    }
    /**
     * setId - setter.
     * @param id - id.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
