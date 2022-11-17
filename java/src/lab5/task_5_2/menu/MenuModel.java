package lab5.task_5_2.menu;

import lab5.task_5_2.book.array.BookArrayController;
import lab5.task_5_2.book.datagenerator.ProcessingDataGenerator;

class MenuOptions {

	public final static String FIND_BY_PUBLISHER = "1";
	public final static String FIND_BY_AUTHOR = "2";
	public final static String FIND_AFTER_YEAR = "3";
	public final static String SORT_BY_PUBLISHER = "4";
	public final static String DEFAULT_STORAGE = "5";
	public final static String WRITE_OBJECT = "6";
	public final static String READ_OBJECTS = "7";
	public final static String EXIT = "8";
}

public class MenuModel {

	BookArrayController books;

	public void setControllers(BookArrayController books) {
		this.books = books;
	}

	public int processInput(String command) {
		int state = MenuStates.STATUS_PROCESS_BOOKS;

		switch (command) {
		case MenuOptions.FIND_BY_PUBLISHER -> getBooksOfAuthor();
		case MenuOptions.FIND_BY_AUTHOR -> getBooksOfPublisher();
		case MenuOptions.FIND_AFTER_YEAR -> getBooksAfterYear();
		case MenuOptions.SORT_BY_PUBLISHER -> sortBooksByPublisher();
		case MenuOptions.DEFAULT_STORAGE -> resetFileStorage();
		case MenuOptions.WRITE_OBJECT -> state = MenuStates.STATUS_WRITE_FILE;
		case MenuOptions.READ_OBJECTS -> state = MenuStates.STATUS_READ_FILE;
		case MenuOptions.EXIT -> state = MenuStates.STATUS_EXIT;
		default -> state = MenuStates.STATUS_INCORRECT_COMMAND;
		}
		return state;
	}

	private void getBooksOfAuthor() {
		String author = ProcessingDataGenerator.getRandomElement(ProcessingDataGenerator.AUTHORS);
		books.getBooksOfAuthor(author);
	}

	private void getBooksOfPublisher() {
		String publisher = ProcessingDataGenerator.getRandomElement(ProcessingDataGenerator.PUBLISHERS);
		books.getBooksOfPublisher(publisher);
	}

	private void getBooksAfterYear() {
		int year = ProcessingDataGenerator.getRandomElement(ProcessingDataGenerator.YEARS);
		books.getBooksAfterYear(year);
	}

	private void sortBooksByPublisher() {
		books.sortBooksByPublisher();
	}
	
	private void resetFileStorage() {
		books.resetFileStorage();
	}
}
