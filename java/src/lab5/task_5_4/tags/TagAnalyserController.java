package lab5.task_5_4.tags;

import java.util.HashMap;

public class TagAnalyserController {

	TagAnalyserModel model;
	TagAnalyserView view;

	public TagAnalyserController(TagAnalyserModel model, TagAnalyserView view) {
		this.model = model;
		this.view = view;
	}

	public void sortTagsByAlphabet(String html) {
		HashMap<String, Integer> tags = model.sortTagsByAlphabet(html);
		view.showSortedTags(tags, TagAnalyserView.SORTED_BY_ALPHABET, TagAnalyserView.EMPTY);
	}

	public void sortTagsByOccurence(String html) {
		HashMap<String, Integer> tags = model.sortTagsByOccurence(html);
		view.showSortedTags(tags, TagAnalyserView.SORTED_BY_OCCURENCE, TagAnalyserView.EMPTY);
	}
}
