package by.epam.classesAndObjects.task5;

public class Counter {

	private int state;
	private int lowerBound;
	private int upperBound;

	public Counter() {
		this.state = 0;
		this.lowerBound = 0;
		this.upperBound = 10;
	}

	public Counter(int state, int lowerBound, int upperBound) {
		if (lowerBound > upperBound) {
			throw new IllegalArgumentException("lower bound is greater than upper bound");
		} else {
			this.lowerBound = lowerBound;
			this.upperBound = upperBound;
		}
		if (state < lowerBound || state > upperBound) {
			throw new IllegalArgumentException("The state of the counter(" + state + ") is out of range");
		}
		this.state = state;
	}

	public int getState() {
		return state;
	}

	public int getLowerBound() {
		return lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void increment() {
		this.state++;
		if (this.state > this.upperBound) {
			throw new IndexOutOfBoundsException("out of range");
		}
	}

	public void decrement() {
		this.state--;
		if (this.state < this.lowerBound) {
			throw new IndexOutOfBoundsException("out of range");
		}
	}

}
