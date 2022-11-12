package lab5.task_5_1.strprocessor;

public class StringProcessorController {

	private StringProcessorModel model;
	private StringProcessorView view;
	
	StringProcessorController(StringProcessorModel model, StringProcessorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void mostWordsLine(String str) {
		String line = model.mostWordsLine(str);
		view.printMostWordsLine(line);
	}
}
