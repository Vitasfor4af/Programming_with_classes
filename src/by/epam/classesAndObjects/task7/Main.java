package by.epam.classesAndObjects.task7;

/* Описать класс, представляющий треугольник.
   Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан. */

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(-4, 8, 5, -4, 10, 6);
		System.out.println("Square = " + triangle.getSquare());
		System.out.println("Perimeter = " + triangle.getPerimeter());
		System.out.println("Median intersection point: (" + triangle.getMedianX() + "," + triangle.getMedianY() + ")");

	}

}
