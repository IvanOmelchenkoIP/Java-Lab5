package lab5.task_5_4.tags;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import lab5.task_5_4.tags.comparators.MapKeyComparator;
import lab5.task_5_4.tags.comparators.MapValueComparator;

public class TagAnalyserModel {

	public HashMap<String, Integer> sortTagsByAlphabet(HashMap<String, Integer> tags) {
		Comparator<Map.Entry<String, Integer>> comparator = new MapKeyComparator();
		return sortTags(tags, comparator);
	}

	public HashMap<String, Integer> sortTagsByOccurence(HashMap<String, Integer> tags) {
		Comparator<Map.Entry<String, Integer>> comparator = new MapValueComparator();
		return sortTags(tags, comparator);
	}

	private HashMap<String, Integer> sortTags(HashMap<String, Integer> tags,
			Comparator<Map.Entry<String, Integer>> comparator) {
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(tags.entrySet());
		Collections.sort(list, comparator);

		LinkedHashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		return sorted;
	}
}
