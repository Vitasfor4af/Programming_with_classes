package by.epam.classesAndObjects.task8;

/* Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими
конструкторами и методами. Задать критерии выбора данных и вывести
эти данные на консоль.

 Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной
 карточки, номер банковского счета.
	Найти и вывести:
	a) список покупателей в алфавитном порядке;
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
		Customer[] customer = new Customer[4];
		customer[0] = new Customer(3, "Gubin", "Vitaliy", "Olegovich", "Amster", 44465879, 123);
		customer[1] = new Customer(4, "Rakun", "Sasha", "Rakuet", "Lon", 56798809, 754);
		customer[2] = new Customer(7, "Arehov", "Peter", "Arnana", "Kis", 79888080, 413);
		customer[3] = new Customer(6, "Zitrax", "Mihail", "Piterparlk", "Araba", 877856655, 789);
		sort(customer);
		getCustomerArray(customer);
	}

	private static void sort(Customer[] customer) {
		for (int i = customer.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (customer[j + 1].getSurname().compareTo(customer[j].getSurname()) < 0) {
					Customer tmp = customer[j];
					customer[j] = customer[j + 1];
					customer[j + 1] = tmp;
				}
			}
		}
	}

	private static void getCustomerArray(Customer[] customer) {
		for (int i = 0; i < customer.length; i++) {
			System.out.println(customer[i]);
		}
	}

	private static void getCardNumberInRange(Customer[] customer, int lowerBound, int upperBound) {
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getCardNumber() >= lowerBound && customer[i].getCardNumber() <= upperBound) {
				System.out.println(customer[i].getSurname());
			}
		}
	}

}
