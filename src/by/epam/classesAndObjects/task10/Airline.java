package by.epam.classesAndObjects.task10;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
   set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
   с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
   на консоль. Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
   Найти и вывести:
   a) список рейсов для заданного пункта назначения;
   b) список рейсов для заданного дня недели;
   c) список рейсов для заданного дня недели, время вылета для которых больше заданного. */

public class Airline {
	private String pointName;
	private int flightNumber;
	private String aircraftType;
	private int departureTime;
	private String weekDay;
	
	public Airline(String pointName, int flightNumber, String aircraftType, int departureTime, String weekDay) {
		this.pointName = pointName;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.weekDay = weekDay;
	}

	public String getPointName() {
		return pointName;
	}

	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	@Override
	public String toString() {
		return "Airline [pointName=" + pointName + ", flightNumber=" + flightNumber + ", aircraftType=" + aircraftType
				+ ", departureTime=" + departureTime + " hours, weekDay=" + weekDay + "]";
	}
	
	
}
