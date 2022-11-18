package lab5.task_5_2;

import lab5.task_5_2.book.array.*;
import lab5.task_5_2.fs.FileObjectSystem;
import lab5.task_5_2.menu.*;
import lab5.task_5_2.scanner.InputScanner;

public class Main {

	public static void main(String[] args) {
		MenuModel menuModel = new MenuModel();
		MenuView menuView = new MenuView();
		MenuController menu = new MenuController(menuModel, menuView);
		
		BookArrayModel booksModel = new BookArrayModel();
		BookArrayView booksView = new BookArrayView();
		FileBookStorage fileStorage = new FileBookStorage();
		BookArrayController books = new BookArrayController(booksModel, booksView, fileStorage);
		FileObjectSystem fs = new FileObjectSystem();
		InputScanner scanner = new InputScanner();
		
		menu.launch(books, fs, scanner);
	}

}