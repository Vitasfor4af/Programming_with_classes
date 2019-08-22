package by.epam.classesAndObjects.task3;

/* Создайте класс с именем Student, содержащий поля:
фамилия и инициалы, номер группы, успеваемость (массив из пяти
элементов). Создайте массив из десяти элементов такого типа.
Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10. */

public class Main {

	public static void main(String[] args) {
		Student[] student = new Student[10];
		student[0] = new Student("Gubin", "V. O.", 10903517, 9);
		student[1] = new Student("Mager", "O. S.", 10903516, 7);
		student[2] = new Student("Kabak", "E. C.", 10204117, 8);
		student[3] = new Student("Renat", "V. Z.", 10902311, 7);
		student[4] = new Student("Kasperovich", "E. S.", 10902118, 6);
		student[5] = new Student("Avdechik", "V. S.", 10904516, 7);
		student[6] = new Student("Vinogradova", "M. K.", 10905612, 9);
		student[7] = new Student("Rajko", "A. O.", 10702617, 6);
		student[8] = new Student("Morozov", "P. I.", 10301116, 4);
		student[9] = new Student("Erema", "Z. D.", 10405715, 10);
		getBestProgress(student);
	}

	private static void getBestProgress(Student[] student) {
		for (int i = 0; i < student.length; i++) {
			if (student[i].getProgress() == 9 || student[i].getProgress() == 10) {
				System.out.printf("\n%15s %d", student[i].getSurname(), student[i].getGroupNumber());
			}
		}
	}

}
