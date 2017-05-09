package ru.job4j.models;
/**
 * Item класс заявки.
 * @author romatihsenko
 * @since 04.05.2017
 * @version 1
 */
public class Item {
    /**
     * name - переменная имени юзера.
     */
    private String name;
    /**
     * description - описание.
     */
    private String description;
    /**
     * create- время создания заявки.
     */
    private long create;
    /**
     * id - уникальный ключ.
     */
    private String id;
    /**
     * Конструктор.
     * @param name - имя
     * @param description - описание
     * @param id - дата создания
     */
    public Item(String name, String description, String id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }
    /**
     * Геттер.
     * @return id
     */
    public String getId() {
        return id;
    }
     /**
     * Сеттер.
     * @param id - id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Геттер.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Сеттер.
     * @param name - имя
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Геттер.
     * @return desc
     */
    public String getDescription() {
        return description;
    }

    /**
     * Сеттер.
     * @param description - описание
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Геттер.
     * @return create
     */
    public long getCreate() {
        return create;
    }

    /**
     * Сеттер.
     * @param create - cr
     */
    public void setCreate(long create) {
        this.create = create;
    }
     /*
     * toString() - переназначение метода.
     */
    @Override
    public String toString() {
        return String.format("Заявка : %s\r\nОписание : %s\r\nId : %s\r\nДата создания : %s", this.name, this.description, this.id, this.create);
    }
}
