package by.epam.classesAndObjects.task4;

public class Train {
	
	private String pointName;
	private int trainNumber;
	private int departureTime;
	
	public Train(String pointName, int trainNumber, int departureTime) {
		this.pointName = pointName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;	
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	
}
