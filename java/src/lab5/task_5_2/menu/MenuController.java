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
			boolean[] ret = model.processInput(input);
			runFlag = ret[0];
			if (ret[1]) {
				view.printMenuMessage(MenuView.INVALID_COMMAND);
			}
		}
		view.printMenuMessage(MenuView.EXIT);
		scanner.close();
	}
}
