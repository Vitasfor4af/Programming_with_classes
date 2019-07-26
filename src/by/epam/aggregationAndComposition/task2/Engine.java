package by.epam.aggregationAndComposition.task2;

public class Engine {
	private int fuel;

	public Engine(int fuel) {
		this.fuel = fuel;
	}

	public int getFuel() {
		return fuel;
	}

	public void addFuel(int fuel) {
		this.fuel += fuel;
	}
}
