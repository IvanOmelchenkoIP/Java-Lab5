package lab5.task_5_1.menu;

import java.io.IOException;

import lab5.task_5_1.fs.FileSystem;
import lab5.task_5_1.strprocessor.StringProcessorController;

public class MenuCountroller {

	private boolean runFlag = false;

	private final MenuModel model;
	private final MenuView view;

	private final InputScanner scanner;

	public MenuCountroller(MenuModel model, MenuView view, InputScanner scanner) {
		this.model = model;
		this.view = view;
		this.scanner = scanner;
	}

	public void launch(FileSystem fs, StringProcessorController sp) {
		model.addControllers(fs, sp);
		runFlag = true;
		while (runFlag) {
			view.showMessage(MenuView.MENU);
			view.showMessage(MenuView.MENU_INPUT_FIELD);
			String input = scanner.scan();
			boolean readFile = processCommand(input);
			if (readFile) {
				view.showMessage(MenuView.FILE_INPUT_FIELD);
				String filepath = scanner.scan();
				processFile(filepath);
			}
		}
	}

	private boolean processCommand(String input) {
		int command = model.processCommand(input);
		boolean readFile = false;
		switch (command) {
		case MenuStates.STATUS_EXIT:
			runFlag = false;
			view.showMessage(MenuView.EXIT);
			break;
		case MenuStates.STATUS_INCORRECT_COMMAND:
			view.showMessage(MenuView.COMMAND_ERROR);
			break;
		case MenuStates.STATUS_READ_FILE:
			readFile = true;
			break;
		}
		return readFile;
	}

	private void processFile(String filepath) {
		try {
			model.processFile(filepath);
		} catch (IOException exception) {
			view.showMessage(MenuView.FILE_ERROR);
			System.out.println(exception);
		}
	}
}