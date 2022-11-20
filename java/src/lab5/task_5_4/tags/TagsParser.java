package lab5.task_5_4.tags;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagsParser {

	public HashMap<String, Integer> getTagsOccurenceFromHtml(String html) {
		HashMap<String, Integer> tags = new HashMap<String, Integer>();

		String[] htmlLines = html.replaceAll("\n", "").split("<");
		for (String line : htmlLines) {
			String tag = findTag(line);
			if (tag != "") {
				setTagOccurence(tags, tag);
			}
		}
		return tags;
	}

	private String findTag(String line) {
		String tag = line.split(">")[0].split(" ")[0];
		Pattern pattern = Pattern.compile("\\W");
		Matcher matcher = pattern.matcher(tag);
		if (matcher.find()) {
			return "";
		} else {
			return tag;
		}
	}

	private void setTagOccurence(HashMap<String, Integer> tags, String tag) {
		if (!tags.containsKey(tag)) {
			tags.put(tag, 1);
		} else {
			tags.replace(tag, tags.get(tag) + 1);
		}
	}
}
