package lab5.task_5_1.strprocessor;

public class StringProcessorView {

	public void printMostWordsLine(String line) {
		if (line == "") {
			System.out.println("There were no lines to filter in the input!");
		} else {
			System.out.println("The line with the most words: " + line);
		}
	}
}
