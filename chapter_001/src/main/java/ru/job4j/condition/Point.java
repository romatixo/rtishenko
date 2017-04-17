package ru.job4j.condition;
/**
* Point класс точки .
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class Point {
  /**
  * x - координата х.
  */
   private int x;
   /**
  * y - координата y.
  */
   private int y;
  /**
  * Point - конструктор класса Point.
  * @param x - первый параметр
  * @param y - второй параметр
  */
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  /**
  * getX - метод получающий х.
  * @return - возвращает х
  */
  public int getX() {
      return this.x;
  }
 /**
 * getY - метод получающий у.
 * @return - возвращает у
 */
  public int getY() {
     return this.y;
  }
  /**
  * is - метод проверяющий нахождение точки на фунции.
  * @param  a - первый параметр.
  * @param   b - второй параметр
  * @return - возвращает true если точка находиться на функции и наоборот
  */
  public boolean is(int a, int b) {
    return this.y == a * this.x + b;
  }
}