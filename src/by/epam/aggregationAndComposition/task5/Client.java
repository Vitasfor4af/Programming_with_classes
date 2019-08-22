package by.epam.aggregationAndComposition.task5;

import java.util.Arrays;

public class Client {
	private final int DEFAULT = 1;
	private String name;
	private Tour[] tours;

	{
		tours = new Tour[DEFAULT];
	}

	public Client(String name) {
		this.name = name;
	}

	public void addTour(Tour tour) {
		if (tour != null) {
			for (int i = 0; i < tours.length; i++) {
				if (tours[i] == null) {
					tours[i] = tour;
					break;
				}
			}
		}
	}

	public void removeTour(Tour tour) {
		if (tour != null) {
			for (int i = 0; i < tours.length; i++) {
				if (tours[i] != null && tours[i].equals(tour)) {
					tours[i] = null;
					break;
				}
			}
		}
	}

	public Tour getTourByType(String type) {
		Tour tour = null;
		if (type != null) {
			for (int i = 0; i < tours.length; i++) {
				if (tours[i].getTourType().equals(type)) {
					tour = tours[i];
					break;
				}
			}
		}
		return tour;
	}

	public void sort() {
		for (int i = tours.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tours[j + 1].getTourType().compareTo(tours[j].getTourType()) < 0) {
					Tour tmp = tours[j];
					tours[j] = tours[j + 1];
					tours[j + 1] = tmp;
				}
			}
		}
	}

	public String getClientName() {
		return name;
	}

	public Tour[] getTours() {
		return tours;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(tours);
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
		Client other = (Client) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(tours, other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", tours=" + Arrays.toString(tours) + "]";
	}
}
