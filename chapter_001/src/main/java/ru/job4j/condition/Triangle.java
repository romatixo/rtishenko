package ru.job4j.condition;
import static java.lang.Math.abs;
/**
* Triangle класс точки .
* @author romatihsenko
* @since 15.04.2017
* @version 1
*/
public class Triangle {
  /**
  * a - первая точка.
  */
	private Point a;
  /**
  * b - вторая точка.
  */
	private Point b;
  /**
  * с - третья точка.
  */
	private Point c;

   /**
   * Контруктор.
   * @param a точка
   * @param b точка
   * @param c точка
   */
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	/**
	* area - метод подсчёта площади.
	* @return - результат
	*/
	public double area() {
		return abs(((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2);
	}
}