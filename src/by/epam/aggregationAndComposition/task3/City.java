package by.epam.aggregationAndComposition.task3;

public class City {
	private String name;
	private boolean capital;
	private boolean regionCenter;
	private District[] districts;

	public City(String name, boolean capital, boolean regionCenter, District[] districts) {
		this.name = name;
		this.capital = capital;
		this.regionCenter = regionCenter;
		this.districts = districts;
	}

	public String getCityName() {
		return name;
	}

	public void getDistrict() {
		for (int i = 0; i < districts.length; i++) {
			System.out.println(districts[i].getDistrictName());
		}	
}
	
	public boolean isCapital() {
		return capital;
	}

	public boolean isRegionCenter() {
		return regionCenter;
	}
}
