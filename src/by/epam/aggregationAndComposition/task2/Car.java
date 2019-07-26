package by.epam.aggregationAndComposition.task2;

public class Car {
	private boolean move;
	private String model;
	private Wheel[] wheels;

	public Car(String model, Wheel[] wheels) {
		this.model = model;
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public boolean isMove() {
		return move;
	}

	public void drive() {
		this.move = true;
		System.out.println("Car rides.");
	}

	public void stop() {
		this.move = false;
		System.out.println("Car stopped.");
	}

	public void fillCar(int liters, Engine engine) {
		if (!isMove()) {
			engine.addFuel(liters);
			System.out.println("The car is filled with " + liters + " liters.");
			System.out.println("Now the volume of fuel is: " + engine.getFuel() + " liters.");
		} else {
			System.out.println("Stop the car brand " + getModel());
		}
	}

	public void replaceWheel(int diameter, int wheelNumber) {
		if (!isMove()) {
			System.out.println("Wheel with number " + wheelNumber + " replaced by wheel with diameter " + diameter);
			wheels[wheelNumber].setDiameter(diameter);
		} else {
			System.out.println("Stop the car brand " + getModel());
		}
	}
}
