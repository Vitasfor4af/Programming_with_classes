package by.epam.aggregationAndComposition.task3;

import java.util.Arrays;

public class City {
	private final int DEFAULT = 15;
	private String name;
	private District[] districts;

	{
		districts = new District[DEFAULT];
	}

	public City(String name) {
		this.name = name;
	}

	public void addDistrict(District district) {
		if (district != null) {
			for (int i = 0; i < districts.length; i++) {
				if (districts[i] == null) {
					districts[i] = district;
					break;
				}
			}
		}
	}

	public void removeDistrict(District district) {
		if (district != null) {
			for (int i = 0; i < districts.length; i++) {
				if (districts[i] != null && districts[i].equals(district)) {
					districts[i] = null;
					break;
				}
			}
		}
	}

	public District getDistrictByName(String name) {
		District district = null;
		if (name != null) {
			for (int i = 0; i < districts.length; i++) {
				if (districts[i].getDistrictName().equals(name)) {
					district = districts[i];
					break;
				}
			}
		}
		return district;
	}

	public String getCityName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(districts);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		City other = (City) obj;
		if (!Arrays.equals(districts, other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}	
}
