package by.epam.classesAndObjects.task3;

public class Student {
	private String surname;
	private String initials;
	private int groupNumber;
	private int progress;
	
	public Student(String surname, String initials, int groupNumber, int progress) {
		this.surname = surname;
		this.initials = initials;
		this.groupNumber = groupNumber;
		this.progress = progress;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	

}
