package by.epam.aggregationAndComposition.task2;

/* Создать объект класса Автомобиль, используя классы
   Колесо, Двигатель. Методы: ехать, заправляться,
   менять колесо, вывести на консоль марку автомобиля. */

public class Main {

	public static void main(String[] args) {
	Car car = new Car("Lamborgini", 150);
	car.chargeFuel(40);
	car.startEngine();
	car.ride();
	car.stopEngine();
	car.changeWheel(25);
	System.out.println(car.getCarName());
		
	}
}
