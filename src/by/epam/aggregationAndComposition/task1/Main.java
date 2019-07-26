package by.epam.aggregationAndComposition.task1;

/* Создать объект класса Текст, используя классы Предложение,
   Слово. Методы: дополнить текст, вывести на
   консоль текст, заголовок текста. */

public class Main {

	public static void main(String[] args) {
		Word word = new Word("Text");
		Text text = new Text(word);

		Word word1 = new Word("Some");
		Word word2 = new Word("text");

		Sentence sentence = new Sentence();
		sentence.addValue(word1);
		sentence.addValue(word2);

		text.addBody(sentence);

		text.outputText();
	}
}
