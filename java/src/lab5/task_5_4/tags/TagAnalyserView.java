package lab5.task_5_4.tags;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TagAnalyserView {

	public final static String SORTED_BY_ALPHABET = "The tags sorted by alphabet: \n";
	public final static String SORTED_BY_OCCURENCE = "The tags sorted by occurence: \n";
	public final static String EMPTY = "There were no tags found on a page!\n";

	public void showSortedTags(HashMap<String, Integer> tags, String msgSuccess, String msgError) {
		if (tags.size() == 0) {
			System.out.println(msgError);
		}

		System.out.println(msgSuccess);
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(tags.entrySet());
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println("Tag: \"" + entry.getKey() + "\", Occurence amount: " + entry.getValue());
		}
	}
}
