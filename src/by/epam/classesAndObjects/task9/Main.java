package by.epam.classesAndObjects.task9;

/* Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года. */

public class Main {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		book[0] = new Book(4, "Baka", "Andrew", "Minsk", 2007, 163, 5, "wood");
		book[1] = new Book(3, "Cry of baby", "Newman", "London", 2016, 163, 5, "metal");
		book[2] = new Book(5, "Sandra", "Paul", "Riga", 2005, 163, 5, "wood");
		book[3] = new Book(6, "New legend", "Edward", "Paris", 2010, 163, 5, "metal");
		book[4] = new Book(2, "Wonderland", "Paul", "Minsk", 2018, 163, 5, "wood");
		bookByYear(book, 2008);
	}

	public static void bookByAuthor(Book[] book, String author) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAuthor() == author) {
				System.out.println(book[i].getName());
			}
		}
	}

	public static void bookByPublishing(Book[] book, String publishingHouse) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublishingHouse() == publishingHouse) {
				System.out.println(book[i].getName());
			}
		}
	}

	public static void bookByYear(Book[] book, int publishingYear) {
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublishingYear() > publishingYear) {
				System.out.println(book[i].getName());
			}
		}
	}

}
