package lab5.task_5_2.menu;

import lab5.task_5_2.book.array.BookArrayController;
import lab5.task_5_2.scanner.InputScanner;

public class MenuController {

	private boolean runFlag;

	private MenuModel model;
	private MenuView view;

	public MenuController(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}

	public void launch(BookArrayController books, InputScanner scanner) {
		runFlag = true;
		
		books.initBookArray();
		model.setControllers(books);

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
		switch(command) {
		case MenuStates.STATUS_EXIT -> runFlag = false;
		case MenuStates.STATUS_INCORRECT_COMMAND -> view.printMenuMessage(MenuView.INVALID_COMMAND);
		case MenuStates.STATUS_WRITE_FILE -> writeFile(scanner);
		case MenuStates.STATUS_READ_FILE -> readFile(scanner);
		}
	}
	
	private void writeFile(InputScanner scanner) {
		
	}
	
	private void readFile(InputScanner scanner) {
		
	}
}
