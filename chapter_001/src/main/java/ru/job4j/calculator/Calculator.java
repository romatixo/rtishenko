package ru.job4j.calculator;
/**
* Calculator класс каолькулятора.
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class Calculator {
    /**
    * result - переменная результата.
    */
    private double result;
    /**
    * add - метод суммирования двух чисел.
    * @param first - первый аргумент
    * @param second - второй аргумент
    */
    public void add(double first, double second) {
        this.result = first + second;
    }
  /**
    * substruct - метод вычитания  двух чисел.
     * @param first - первый аргумент
    * @param second - второй аргумент
    */
    public void substruct(double first, double second) {
    	this.result = first - second;
    }
    /**
    * substruct - метод деления  двух чисел.
     * @param first - первый аргумент
    * @param second - второй аргумент
    */
    public void div(double first, double second) {
    	 this.result = first / second;
    }

    /**
    * add - метод умножения двух чисел.
     * @param first - первый аргумент
    * @param second - второй аргумент
    */
    public void multiple(double first, double second) {
    	this.result = first * second;
    }

 /**
    * getResult - метод возвращения результата.
    * @return результат
    */
    public double getResult() {
        return this.result;
    }
}