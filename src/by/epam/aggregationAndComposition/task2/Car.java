package by.epam.aggregationAndComposition.task2;

public class Car {
	private final int DEFAULT = 0;

	private String carName;
	private int maxFuel;
	private int fuel;

	private Engine engine = new Engine(5);

	private Wheel frontRight = new Wheel();
	private Wheel frontLeft = new Wheel();
	private Wheel rearRight = new Wheel();
	private Wheel rearLeft = new Wheel();

	Car() {
		this.carName = "Undefined";
		this.maxFuel = DEFAULT;
		this.fuel = maxFuel;
	}

	Car(String name, int fuel) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("Car must have a brand");
		} else {
			this.carName = name;
		}
		if (fuel < 0) {
			throw new IllegalArgumentException("Tank capacity cannot be negative");
		} else {
			this.maxFuel = fuel;
		}
		this.fuel = maxFuel;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setTank(int tank) {
		this.maxFuel = tank;
		this.fuel = this.maxFuel;
	}

	public int getFuel() {
		return this.fuel;
	}

	public void ride() {
		if (this.fuel == 0) {
			System.out.println("It is impossible to ride, the tank is empty");
		} else if (!engine.isStarted()) {
			System.out.println("Engine not running");
		} else {
			System.out.println("Ride");
		}
	}

	public void chargeFuel(int fuel) {
		int balance = this.maxFuel - this.fuel;
		int availability = this.maxFuel - balance;
		if (this.maxFuel == 0)
			System.out.println("Tank capacity not initialized");
		else if (this.maxFuel < fuel)
			System.out.println(
					"The volume of the tank is " + this.maxFuel + " liters, it does not fit " + fuel + " liters");
		else if (availability + fuel == this.maxFuel) {
			System.out.println("The machine is successfully refilled with " + fuel + " liters");
		} else if (this.fuel == this.maxFuel && this.maxFuel - this.fuel != 0) {
			System.out.println("Unable to fill " + fuel + " liters");
			System.out.println("Tank is not empty. Balance " + availability + " liters");
			System.out.println("You can refuel no more than " + balance + " liters");
		} else {
			this.fuel = fuel;
			System.out.println("The machine is successfully filled with " + fuel + " liters");
		}
	}

	public void changeWheel(double radius) {
		if (this.engine.isStarted()) {
			System.out.println("You can not change the wheels on the go");
		} else {
			this.frontRight = new Wheel(radius);
			this.frontLeft = new Wheel(radius);
			this.rearRight = new Wheel(radius);
			this.rearLeft = new Wheel(radius);
			System.out.println("Wheels successfully replaced");
		}
	}

	public void startEngine() {
		if (this.fuel != 0) {
			this.engine.startEngine();
		} else {
			System.out.println("Do not start the car, the tank is empty");
		}
	}

	public void stopEngine() {
		this.engine.stopEngine();
	}

	public int getMileage() {
		return this.engine.getMileage();
	}

	public void setExpense(int expense) {
		this.engine.setExpense(expense);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((frontLeft == null) ? 0 : frontLeft.hashCode());
		result = prime * result + ((frontRight == null) ? 0 : frontRight.hashCode());
		result = prime * result + fuel;
		result = prime * result + maxFuel;
		result = prime * result + ((rearLeft == null) ? 0 : rearLeft.hashCode());
		result = prime * result + ((rearRight == null) ? 0 : rearRight.hashCode());
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
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (frontLeft == null) {
			if (other.frontLeft != null)
				return false;
		} else if (!frontLeft.equals(other.frontLeft))
			return false;
		if (frontRight == null) {
			if (other.frontRight != null)
				return false;
		} else if (!frontRight.equals(other.frontRight))
			return false;
		if (fuel != other.fuel)
			return false;
		if (maxFuel != other.maxFuel)
			return false;
		if (rearLeft == null) {
			if (other.rearLeft != null)
				return false;
		} else if (!rearLeft.equals(other.rearLeft))
			return false;
		if (rearRight == null) {
			if (other.rearRight != null)
				return false;
		} else if (!rearRight.equals(other.rearRight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", maxFuel=" + maxFuel + ", fuel=" + fuel + ", engine=" + engine
				+ ", frontRight=" + frontRight + ", frontLeft=" + frontLeft + ", rearRight=" + rearRight + ", rearLeft="
				+ rearLeft + "]";
	}
}
