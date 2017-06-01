package ru.job4j.mapbank;
/**
 * Account класс аккаунта пользователя.
 * @author romatihsenko
 * @since 1.06.2017
 * @version 1
 */
public class Account {
    @Override
    public String toString() {
        return "Account{" +
                "value=" + value +
                ", requisites=" + requisites +
                '}';
    }

    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * Кол-во денег.
     */
    private double value;
    /**
     * Реквизиты.
     */
    private int requisites;

    public double getValue() {
        return value;
    }

    public int getRequisites() {
        return requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (value != account.value) return false;
        return requisites == account.requisites;
    }

    @Override
    public int hashCode() {
        double result = value;
        result = 31 * result + requisites;
        return (int)result;
    }
}
