package by.epam.aggregationAndComposition.task3;

/* Создать объект класса Государство, используя классы
   Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {
		City[] cities = new City[8];
		Region[] regions = new Region[6];
		District[] districts = new District[2];
		districts[0] = new District("Frunzensky");
		districts[1] = new District("Leninski");
		cities[3] = new City("Minsk", true, true, districts);
		cities[2] = new City("Grodno", false, true, districts);
		cities[0] = new City("Brest", false, true, districts);
		cities[5] = new City("Vitebsk", false, true, districts);
		cities[6] = new City("Borisov", false, true, districts);
		cities[4] = new City("Mogilev", false, true, districts);
		cities[1] = new City("Gomel", false, true, districts);
		cities[7] = new City("Smorgon", false, true, districts);
		regions[2] = new Region("Grodno region");
		regions[0] = new Region("Brest region");
		regions[3] = new Region("Minsk region");
		regions[1] = new Region("Gomel region");
		regions[5] = new Region("Vitebsk region");
		regions[4] = new Region("Mogilev region");

		State state = new State("Belarus", 207.595, regions, cities);
		state.getCapital();
		System.out.println("regions number = " + state.getRegionsNumber());
		System.out.println("Square = " + state.getSquare());
		state.getRegionCenter();
	}

}
