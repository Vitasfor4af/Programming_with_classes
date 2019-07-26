package by.epam.classesAndObjects.task4;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда,
время отправления. Создайте данные в массив из пяти элементов типа Train, добавьте
возможность сортировки элементов массива по номерам поездов. Добавьте возможность
вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления. */

public class Main {

	public static void main(String[] args) {
		Train[] train = new Train[5];
		train[0] = new Train("Minsk", 6017, 3);
		train[1] = new Train("Riga", 8932, 11);
		train[2] = new Train("London", 5890, 6);
		train[3] = new Train("Moscow", 6367, 7);
		train[4] = new Train("Stockholm", 3567, 4);
		sortPointName(train);
		for (int i = 0; i < train.length; i++) {
			System.out.printf("\n%15s %d %d", train[i].getPointName(), train[i].getTrainNumber(),
					train[i].getDepartureTime());
		}
	}

	public static void sortTrainNumber(Train[] train) {
		for (int i = train.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (train[j].getTrainNumber() > train[j + 1].getTrainNumber()) {
					Train tmp = train[j];
					train[j] = train[j + 1];
					train[j + 1] = tmp;
				}
			}
		}
	}

	public static void sortPointName(Train[] train) {
		for (int i = train.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (train[j + 1].getPointName().compareTo(train[j].getPointName()) < 0) {
					Train tmp = train[j];
					train[j] = train[j + 1];
					train[j + 1] = tmp;
				} else if (train[j + 1].getPointName().compareTo(train[j].getPointName()) == 0) {
					if (train[j].getDepartureTime() > train[j + 1].getDepartureTime()) {
						Train tmp = train[j];
						train[j] = train[j + 1];
						train[j + 1] = tmp;
					}
				}
			}
		}
	}

	public static void getData(int trainNumber, Train[] train) {
		for (int i = 0; i < train.length; i++) {
			if (trainNumber == train[i].getTrainNumber()) {
				System.out.printf("\n%s %d", train[i].getPointName(), train[i].getDepartureTime());
			}
		}
	}

}
