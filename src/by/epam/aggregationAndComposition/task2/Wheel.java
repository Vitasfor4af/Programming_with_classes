package by.epam.aggregationAndComposition.task2;

public class Wheel {
	private final double DEFAULT = 15;
	private double radius;

	public Wheel() {
		this.radius = DEFAULT;
	}

	public Wheel(double radius) {
		if (radius < 14 || radius > 32) {
			throw new IllegalArgumentException("Wheel size must be between 14 and 32 inches");
		} else {
			this.radius = radius;
		}
	}

	public double getDiameter() {
		return radius;
	}

	public void setDiameter(double radius) {
		if (radius < 14 || radius > 32) {
			throw new IllegalArgumentException("Wheel size must be between 14 and 32 inches");
		} else {
			this.radius = radius;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}
}
