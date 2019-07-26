package by.epam.aggregationAndComposition.task2;

/* Создать объект класса Автомобиль, используя классы
   Колесо, Двигатель. Методы: ехать, заправляться,
   менять колесо, вывести на консоль марку автомобиля. */

public class Main {

	public static void main(String[] args) {
		Wheel[] wheels = new Wheel[4];
		wheels[0] = new Wheel(16);
		wheels[1] = new Wheel(16);
		wheels[2] = new Wheel(16);
		wheels[3] = new Wheel(16);
		Engine engine = new Engine(5);
		Car car = new Car("Porshe", wheels);
		
		car.fillCar(5, engine);
		car.drive();
		car.stop();
		car.replaceWheel(12, 3);
		System.out.println(car.getModel());
		System.out.println(wheels[3].getDiameter());
	}

}
