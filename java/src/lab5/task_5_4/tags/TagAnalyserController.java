package lab5.task_5_4.tags;

import java.util.HashMap;

public class TagAnalyserController {

	private TagAnalyserModel model;
	private TagAnalyserView view;
	private TagParser parser;

	public TagAnalyserController(TagAnalyserModel model, TagAnalyserView view, TagParser parser) {
		this.model = model;
		this.view = view;
		this.parser = parser;
	}

	public void sortTagsByAlphabet(String html) {
		HashMap<String, Integer> tags = parser.getTagsOccurenceFromHtml(html);
		HashMap<String, Integer> sorted = model.sortTagsByAlphabet(tags);
		view.showSortedTags(sorted, TagAnalyserView.SORTED_BY_ALPHABET, TagAnalyserView.EMPTY);
	}

	public void sortTagsByOccurence(String html) {
		HashMap<String, Integer> tags = parser.getTagsOccurenceFromHtml(html);
		HashMap<String, Integer> sorted = model.sortTagsByOccurence(tags);
		view.showSortedTags(sorted, TagAnalyserView.SORTED_BY_OCCURENCE, TagAnalyserView.EMPTY);
	}
}
