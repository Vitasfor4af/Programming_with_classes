package by.epam.aggregationAndComposition.task3;

/* Создать объект класса Государство, используя классы
   Область, Район, Город. Методы: вывести на консоль
   столицу, количество областей, площадь, областные центры. */

public class Main {

	public static void main(String[] args) {

		State state = new State("Belarus", 207.595);
		state.addRegion(new Region("Brest region"));
		state.addRegion(new Region("Gomel region"));
		state.addRegion(new Region("Grodno region"));
		state.addRegion(new Region("Minsk region"));
		state.addRegion(new Region("Mogilev region"));
		state.addRegion(new Region("Vitebsk region"));

		state.getRegionByName("Brest region").addCity(new City("Brest"));
		state.getRegionByName("Gomel region").addCity(new City("Gomel"));
		state.getRegionByName("Grodno region").addCity(new City("Grodno"));
		state.getRegionByName("Minsk region").addCity(new City("Minsk"));
		state.getRegionByName("Mogilev region").addCity(new City("Mogilev"));
		state.getRegionByName("Vitebsk region").addCity(new City("Vitebsk"));

		state.getRegionByName("Brest region").getCityByName("Brest").addDistrict(new District("Leninsky"));
		state.getRegionByName("Gomel region").getCityByName("Gomel").addDistrict(new District("Sovetsky"));
		state.getRegionByName("Grodno region").getCityByName("Grodno").addDistrict(new District("Oktyabrsky"));
		state.getRegionByName("Minsk region").getCityByName("Minsk").addDistrict(new District("Partizanski"));
		state.getRegionByName("Mogilev region").getCityByName("Mogilev").addDistrict(new District("Leninsky"));
		state.getRegionByName("Vitebsk region").getCityByName("Vitebsk").addDistrict(new District("Zharzhevo"));

		state.getRegionByName("Brest region")
				.setRegionCenter(state.getRegionByName("Brest region").getCityByName("Brest"));
		state.getRegionByName("Gomel region")
				.setRegionCenter(state.getRegionByName("Gomel region").getCityByName("Gomel"));
		state.getRegionByName("Grodno region")
				.setRegionCenter(state.getRegionByName("Grodno region").getCityByName("Grodno"));
		state.getRegionByName("Minsk region")
				.setRegionCenter(state.getRegionByName("Minsk region").getCityByName("Minsk"));
		state.getRegionByName("Mogilev region")
				.setRegionCenter(state.getRegionByName("Mogilev region").getCityByName("Mogilev"));
		state.getRegionByName("Vitebsk region")
				.setRegionCenter(state.getRegionByName("Vitebsk region").getCityByName("Vitebsk"));
		state.setCapital(state.getRegionByName("Minsk region").getCityByName("Minsk"));
		
		System.out.println(state.toString());
	}

}
