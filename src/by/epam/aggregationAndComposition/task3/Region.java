package by.epam.aggregationAndComposition.task3;

import java.util.Arrays;

public class Region {
	private final int DEFAULT = 12;
	private String name;
	private City[] cities;
	private String regionCenter;

	{
		cities = new City[DEFAULT];
	}

	public Region(String name) {
		this.name = name;
	}

	public void addCity(City city) {
		if (city != null) {
			for (int i = 0; i < cities.length; i++) {
				if (cities[i] == null) {
					cities[i] = city;
					break;
				}
			}
		}
	}

	public void removeCity(City city) {
		if (city != null) {
			for (int i = 0; i < cities.length; i++) {
				if (cities[i] != null && cities[i].equals(city)) {
					cities[i] = null;
					break;
				}
			}
		}
	}

	public City getCityByName(String name) {
		City city = null;
		if (name != null) {
			for (int i = 0; i < cities.length; i++) {
				if (cities[i].getCityName().equals(name)) {
					city = cities[i];
					break;
				}
			}
		}
		return city;
	}

	public String getRegionName() {
		return name;
	}

	public String getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City city) {
		this.regionCenter = city.getCityName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cities);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionCenter == null) ? 0 : regionCenter.hashCode());
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
		Region other = (Region) obj;
		if (!Arrays.equals(cities, other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionCenter == null) {
			if (other.regionCenter != null)
				return false;
		} else if (!regionCenter.equals(other.regionCenter))
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "Region [name=" + name + "]";
	}
}
