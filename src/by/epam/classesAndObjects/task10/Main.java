package by.epam.classesAndObjects.task10;

/* Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные
на консоль. Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного. */

public class Main {

	public static void main(String[] args) {
		Airline[] airline = new Airline[6];
		airline[0] = new Airline("Minsk", 1432, "freight", 4, "Saturday");
		airline[1] = new Airline("London", 2346, "passenger", 1, "Friday");
		airline[2] = new Airline("Riga", 1843, "freight", 7, "Saturday");
		airline[3] = new Airline("Moscow", 3846, "passenger", 6, "Friday");
		airline[4] = new Airline("Ottawa", 1701, "freight", 3, "Wednesday");
		airline[5] = new Airline("Paris", 5472, "passenger", 4, "Tuesday");
		flightByWeekDay(airline, "Friday", 3);
	}

	private static void flightByPointName(Airline[] airline, String pointName) {
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getPointName() == pointName) {
				System.out.println(airline[i].getFlightNumber());
			}
		}
	}

	private static void flightByWeekDay(Airline[] airline, String weekDay) {
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getWeekDay() == weekDay) {
				System.out.println(airline[i].getFlightNumber());
			}
		}
	}

	private static void flightByWeekDay(Airline[] airline, String weekDay, int departureTime) {
		if (departureTime < 0) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getWeekDay() == weekDay && airline[i].getDepartureTime() > departureTime) {
				System.out.println(airline[i].getFlightNumber());
			}
		}
	}

}
