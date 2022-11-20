package lab5.task_5_4.tags;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import lab5.task_5_4.tags.comparators.MapKeyComparator;
import lab5.task_5_4.tags.comparators.MapValueComparator;

public class TagAnalyserModel {

	public HashMap<String, Integer> sortTagsByAlphabet(String html) {
		HashMap<String, Integer> tags = getTagsFromHtml(html);
		Comparator<Map.Entry<String, Integer>> comparator = new MapKeyComparator();
		return sortHashMap(tags, comparator);
	}

	public HashMap<String, Integer> sortTagsByOccurence(String html) {
		HashMap<String, Integer> tags = getTagsFromHtml(html);
		Comparator<Map.Entry<String, Integer>> comparator = new MapValueComparator();
		return sortHashMap(tags, comparator);
	}

	private HashMap<String, Integer> sortHashMap(HashMap<String, Integer> map,
			Comparator<Map.Entry<String, Integer>> comparator) {
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, comparator);

		LinkedHashMap<String, Integer> sorted = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sorted.put(entry.getKey(), entry.getValue());
		}
		return sorted;
	}

	private HashMap<String, Integer> getTagsFromHtml(String html) {
		HashMap<String, Integer> tags = new HashMap<String, Integer>();

		String[] lines = html.replaceAll("\n", "").split("<");
		for (String line : lines) {
			String tag = line.split(" ")[0].split(">")[0];
			if (isTag(tag)) {
				setTagOccurence(tags, tag);
			}
		}
		return tags;
	}

	private void setTagOccurence(HashMap<String, Integer> map, String tag) {
		if (!map.containsKey(tag)) {
			map.put(tag, 1);
		} else {
			map.replace(tag, map.get(tag) + 1);
		}
	}

	private boolean isTag(String tag) {
		Pattern pattern = Pattern.compile("\\W");
		Matcher matcher = pattern.matcher(tag);
		if (tag == "" || matcher.find()) {
			return false;
		} else {
			return true;
		}
	}

}
