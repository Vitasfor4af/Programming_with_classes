package by.epam.aggregationAndComposition.task1;

public class Sentence {
	private String value = "";

	public void addValue(Word word) {
		value += " " + word.getValue();
	}

	public String getValue() {
		return value;
	}
}
