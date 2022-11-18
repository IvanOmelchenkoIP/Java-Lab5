package lab5.task_5_2.menu;

import lab5.task_5_2.book.array.BookArrayController;
import lab5.task_5_2.fs.FileObjectSystem;
import lab5.task_5_2.scanner.InputScanner;

public class MenuController {

	private boolean runFlag;

	private MenuModel model;
	private MenuView view;

	public MenuController(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}

	public void launch(BookArrayController books, FileObjectSystem fs, InputScanner scanner) {
		runFlag = true;

		books.initBookArray();
		model.setControllers(books, fs);

		while (runFlag) {
			view.printMenuMessage(MenuView.NEW_LINE);
			view.printMenuMessage(MenuView.MENU);
			view.printMenuMessage(MenuView.INPUT_FIELD);

			String input = scanner.scanInput();
			int command = model.processInput(input);
			processCommand(command, scanner);
		}
		view.printMenuMessage(MenuView.EXIT);
		scanner.close();
	}

	public void processCommand(int command, InputScanner scanner) {
		switch (command) {
		case MenuStates.STATUS_EXIT -> runFlag = false;
		case MenuStates.STATUS_INCORRECT_COMMAND -> view.printMenuMessage(MenuView.INVALID_COMMAND);
		case MenuStates.STATUS_WRITE_FILE -> writeFile(scanner);
		case MenuStates.STATUS_READ_FILE -> readFile(scanner);
		}
	}

	private void writeFile(InputScanner scanner) {
		view.printMenuMessage(MenuView.INPUT_FILE_FIELD);
		String filepath = scanner.scanInput();
		try {
			model.writeFile(filepath);
			view.printMenuMessage(MenuView.FILE_WRITE_SUCCESS);
		} catch (Exception exception) {
			view.printException(MenuView.FILE_WRITE_ERROR, exception);
		}
	}

	private void readFile(InputScanner scanner) {
		view.printMenuMessage(MenuView.INPUT_FILE_FIELD);
		String filepath = scanner.scanInput();
		try {
			model.readFile(filepath);
		} catch (Exception exception) {
			view.printException(MenuView.FILE_READ_ERROR, exception);
		}
	}
}
