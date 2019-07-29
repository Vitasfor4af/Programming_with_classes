package by.epam.aggregationAndComposition.task2;

public class Engine {
	private int mileage = 0;
	private boolean Started;
	private int expense = 5;

	public Engine(int expense) {
		this.expense = expense;
	}

	public void startEngine() {
		if (this.Started == true) {
			System.out.println("engine is already running");
		} else {
			this.Started = true;
			System.out.println("engine running");
		}
	}

	public void stopEngine() {
		this.Started = false;
	}

	public boolean isStarted() {
		return this.Started;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public int getExpense() {
		return this.expense;
	}

	public int getMileage() {
		return this.mileage;
	}

	public void increase() {
		this.mileage++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + expense;
		result = prime * result + (Started ? 1231 : 1237);
		result = prime * result + mileage;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		if (expense != other.expense)
			return false;
		if (Started != other.Started)
			return false;
		if (mileage != other.mileage)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [mileage=" + mileage + ", hasStarted=" + Started + ", expense=" + expense + "]";
	}
}
