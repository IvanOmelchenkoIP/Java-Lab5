package lab5.task_5_1.strprocessor;

import java.util.ArrayList;
import java.util.Arrays;

public class StringProcessorModel {

	public boolean lineEmpty(String line) {
		return line.replaceAll("\\s+", "").length() == 0;
	}

	public String mostWordsLine(String str) {
		ArrayList<String> lines = new ArrayList<String>(Arrays.asList(str.split("\n")));
		String longest = lines.remove(0);
		for (String line : lines) {
			if (wordCount(longest) < wordCount(line)) {
				longest = line;
			}
		}
		return longest;
	}

	private int wordCount(String str) {
		return str.split("\\s+").length;
	}
}
