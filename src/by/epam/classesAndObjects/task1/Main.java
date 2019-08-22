package by.epam.classesAndObjects.task1;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода
на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных,
и метод, который находит
наибольшее значение из этих двух переменных. */

public class Main {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.setA(4);
		test1.setB(7);
		System.out.println("a = " + test1.getA());
		System.out.println("b = " + test1.getB());
		System.out.println("sum a + b = " + test1.getSum(test1.getA(), test1.getB()));
		System.out.println("max between a and b = " + test1.getMax(test1.getA(), test1.getB()));
	}
}
