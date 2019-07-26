package by.epam.classesAndObjects.task1;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода
   на экран и методы изменения этих переменных.
   Добавьте метод, который находит сумму значений этих переменных,
   и метод, который находит
   наибольшее значение из этих двух переменных. */

public class Test1 {

	private int a;
	private int b;
	
	public void getA() {
		System.out.println(this.a);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void getB() {
		System.out.println(this.b);
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getSum(int a, int b) {
		return (a + b);
	}
	
	public int getMax(int a, int b) {
		return Math.max(a, b);
	}
}
