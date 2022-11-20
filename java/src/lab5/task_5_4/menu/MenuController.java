package lab5.task_5_4.menu;

import lab5.task_5_4.fs.FileUrlSystem;
import lab5.task_5_4.scanner.InputScanner;
import lab5.task_5_4.tags.TagAnalyserController;

public class MenuController {

	private boolean runFlag;

	private MenuModel model;
	private MenuView view;

	public MenuController(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}

	public void launch(InputScanner scanner, FileUrlSystem fs, TagAnalyserController tags) {
		runFlag = true;
		model.addControllers(fs, tags);

		while (runFlag) {
			view.showMessage(MenuView.MENU);
			view.showMessage(MenuView.MENU_INPUT_FIELD);
			String input = scanner.scanInput();
			int state = model.processCommand(input);
			processMenuState(state, scanner);
		}
		scanner.close();
	}

	private void processMenuState(int state, InputScanner scanner) {
		switch (state) {
		case MenuStates.STATUS_INCORRECT_COMMAND -> view.showMessage(MenuView.COMMAND_ERROR);
		case MenuStates.STATUS_EXIT -> runFlag = false;
		case MenuStates.STATUS_TAGS_BY_ALPHABET -> tagsByAlphabet(scanner);
		case MenuStates.STATUS_TAGS_BY_OCCURENCE -> tagsByOccurence(scanner);
		}
	}

	private void tagsByAlphabet(InputScanner scanner) {
		view.showMessage(MenuView.URL_INPUT_FIELD);
		String url = scanner.scanInput();
		try {
			model.tagsByAlphabet(url);
		} catch (Exception exception) {
			view.showException(MenuView.FILE_ERROR, exception);
		}
	}

	private void tagsByOccurence(InputScanner scanner) {
		view.showMessage(MenuView.URL_INPUT_FIELD);
		String url = scanner.scanInput();
		try {
			model.tagsByOccurence(url);
		} catch (Exception exception) {
			view.showException(MenuView.FILE_ERROR, exception);
		}
	}
}
