package by.epam.classesAndObjects.task5;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать
   свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика
   значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и
   уменьшения состояния, и метод позволяющее получить его текущее состояние.
   Написать код, демонстрирующий все возможности класса. */

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter(2, 0, 15);
		System.out.println("initial state of the counter = " + counter.getState());

		while (counter.getState() < counter.getUpperBound()) {
			counter.increment();
			System.out.print(counter.getState() + " ");
		}
		
		System.out.println("\n----------------------------------------------------");
		
		Counter counter2 = new Counter(10, 5, 15);
		System.out.println("initial state of the counter = " + counter2.getState());

		while (counter2.getState() > counter2.getLowerBound()) {
			counter2.decrement();
			System.out.print(counter2.getState() + " ");
		}
	}

}
