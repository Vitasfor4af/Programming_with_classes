package by.epam.classesAndObjects.task6;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		if (hours > 24 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > 24 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void getTime() {
		System.out.printf("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
	}

	public void setTime(int hours, int minutes, int seconds) {
		if (hours > 24 || hours < 0) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
		if (minutes > 59 || minutes < 0) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
		if (seconds > 59 || seconds < 0) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}
}
