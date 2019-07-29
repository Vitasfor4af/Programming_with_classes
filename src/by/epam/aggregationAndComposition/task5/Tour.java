package by.epam.aggregationAndComposition.task5;

public class Tour {
	private String tourType;
	private String transport;
	private boolean food;
	private int numberOfDays;

	public Tour(String tourType, String transport, boolean food, int numberOfDays) {
		this.tourType = tourType;
		this.transport = transport;
		this.food = food;
		this.numberOfDays = numberOfDays;
	}

	public String getTourType() {
		return tourType;
	}

	public void setTourType(String tourType) {
		this.tourType = tourType;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
		result = prime * result + (food ? 1231 : 1237);
		result = prime * result + numberOfDays;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Tour other = (Tour) obj;
		if (tourType == null) {
			if (other.tourType != null)
				return false;
		} else if (!tourType.equals(other.tourType))
			return false;
		if (food != other.food)
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [TourType=" + tourType + ", transport=" + transport + ", food=" + food + ", numberOfDays="
				+ numberOfDays + "]";
	}
}
