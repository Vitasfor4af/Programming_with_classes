package by.epam.classesAndObjects.task2;

/* Создйте класс Test2 двумя переменными. Добавьте конструктор
с входными параметрами. Добавьте конструктор, инициализирующий
члены класса по умолчанию. Добавьте set- и get- методы для 
полей экземпляра класса. */

public class Main {

	public static void main(String[] args) {
		Test2 test2 = new Test2();
		System.out.println("a = " + test2.getA());
		System.out.println("b = " + test2.getB());
	}
}
