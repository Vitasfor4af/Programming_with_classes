package by.epam.aggregationAndComposition.task1;

public class Text {
	private String caption;
	private String bodyText = "";

	public Text(Word word) {
		caption = word.getValue();
	}

	public Text(Sentence sentence) {
		caption = sentence.getValue();
	}

	public String getHeader() {
		return caption;
	}

	public void addBody(Word word) {
		bodyText += " " + word.getValue();
	}

	public void addBody(Sentence sentence) {
		bodyText += " " + sentence.getValue();
	}

	public String getBody() {
		return bodyText;
	}

	public void outputText() {
		System.out.println(getHeader() + "\n" + getBody());
	}
}
