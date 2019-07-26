package by.epam.aggregationAndComposition.task3;

public class State {

	private String name;
	private double square;
	private Region[] regions;
	private City[] cities;

	public State(String name, double square, Region[] regions, City[] cities) {
		this.name = name;
		this.square = square;
		this.regions = regions;
		this.cities = cities;
	}

	public String getStateName() {
		return name;
	}

	public void getCapital() {
		for (int i = 0; i < cities.length; i++) {
			if (cities[i].isCapital()) {
				System.out.println(cities[i].getCityName());
			}
		}
	}

	public void getRegionCenter() {
		for (int i = 0; i < cities.length && i < regions.length; i++) {
			if (cities[i].isRegionCenter()) {
				System.out.println(regions[i].getRegionName() + " : " + cities[i].getCityName());
			}
		}
	}

	public int getRegionsNumber() {
		return regions.length;
	}

	public double getSquare() {
		return square;
	}
}
