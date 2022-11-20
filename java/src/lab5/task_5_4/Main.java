package lab5.task_5_4;

import lab5.task_5_4.fs.FileUrlSystem;
import lab5.task_5_4.menu.*;
import lab5.task_5_4.scanner.InputScanner;
import lab5.task_5_4.tags.*;

public class Main {

	public static void main(String[] args) {

		MenuModel model = new MenuModel();
		MenuView view = new MenuView();

		MenuController menu = new MenuController(model, view);

		InputScanner scanner = new InputScanner();
		FileUrlSystem fs = new FileUrlSystem();
		TagAnalyserModel tagModel = new TagAnalyserModel();
		TagAnalyserView tagView = new TagAnalyserView();
		TagParser parser = new TagParser();
		TagAnalyserController tags = new TagAnalyserController(tagModel, tagView, parser);

		menu.launch(scanner, fs, tags);
	}
}