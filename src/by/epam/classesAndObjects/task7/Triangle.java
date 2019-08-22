package by.epam.classesAndObjects.task7;

public class Triangle {

	private double x1, y1;
	private double x2, y2;
	private double x3, y3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		if (!isPossible()) {
			throw new IllegalArgumentException("with entered coordinates a triangle does not exist");
		}
	}

	private boolean isPossible() {
		return ((getSideA() + getSideB() > getSideC()) && (getSideA() + getSideC() > getSideB())
				&& (getSideB() + getSideC() > getSideA()));
	}

	public double getSideA() {
		return Math.hypot(y2 - y1, x2 - x1);
	}

	public double getSideB() {
		return Math.hypot(y3 - y2, x3 - x2);
	}

	public double getSideC() {
		return Math.hypot(y1 - y3, x1 - x3);
	}

	public double getSquare() {
		double semiPerimeter = getPerimeter() / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - getSideA()) * (semiPerimeter - getSideC())
				* (semiPerimeter - getSideB()));
	}

	public double getPerimeter() {
		return getSideA() + getSideB() + getSideC();
	}

	public double getMedianX() {
		return (x1 + x2 + x3) / 3;
	}

	public double getMedianY() {
		return (y1 + y2 + y3) / 3;
	}

}
