package lab5.task_5_4.tags;

public class TagAnalyserController {

	TagAnalyserModel model;
	TagAnalyserView view;

	public TagAnalyserController(TagAnalyserModel model, TagAnalyserView view) {
		this.model = model;
		this.view = view;
	}

	public void tagsByHtml(String html) {
		model.tagsByHtml(html);
	}

	public void sortByAlphabet() {

	}

	public void sortByTags() {

	}
}
