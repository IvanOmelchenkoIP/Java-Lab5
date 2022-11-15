package lab5.task_5_1.strprocessor;

public class StringProcessorView {

	public void printMostWordsLine(String line, boolean isEmpty) {
		if (isEmpty) {
			System.out.println("There were no lines to filter in the input!\n");
		} else {
			System.out.println("The line with the most words: \"" + line.replaceAll("\n", "") + "\"\n");
		}
	}
}
