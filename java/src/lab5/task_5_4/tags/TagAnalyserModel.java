package lab5.task_5_4.tags;

import java.util.HashMap;

public class TagAnalyserModel {

	HashMap<String, Integer> tags;

	public TagAnalyserModel() {
		tags = new HashMap<String, Integer>();
	}

	private void setTagOccurence(String tag) {
		if (!tags.containsKey(tag)) {
			tags.put(tag, 1);
		} else {
			tags.replace(tag, tags.get(tag) + 1);
		}
	}

	private boolean isTag(String tag) {
		return (tag.contains("\\") || tag.contains("/") || tag.contains("-") || tag == "" || tag.contains("=")) 
				? false
				: true;
	}

	public void tagsByHtml(String html) {
		String[] lines = html.replaceAll("\n", "").split("<");
		for (String line : lines) {
			String tag = line.split(" ")[0].split(">")[0];
			if (isTag(tag)) {
				setTagOccurence(tag);
			}
		}

		System.out.println(tags);
	}

}
