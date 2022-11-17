package lab5.task_5_2.menu;

import lab5.task_5_2.book.array.BookArrayController;
import lab5.task_5_2.book.datagenerator.ProcessingDataGenerator;

class MenueOptions {

	public final static String FIND_BY_PUBLISHER = "1";
	public final static String FIND_BY_AUTHOR = "2";
	public final static String FIND_AFTER_YEAR = "3";
	public final static String SORT_BY_PUBLISHER = "4";
	public final static String EXIT = "5";
}

public class MenuModel {

	BookArrayController books;

	public void setControllers(BookArrayController books) {
		this.books = books;
	}

	public boolean[] processInput(String command) {
		boolean runFlag = true;
		boolean errFlag = false;

		switch (command) {
		case MenueOptions.FIND_BY_PUBLISHER -> getBooksOfAuthor();
		case MenueOptions.FIND_BY_AUTHOR -> getBooksOfPublisher();
		case MenueOptions.FIND_AFTER_YEAR -> getBooksAfterYear();
		case MenueOptions.SORT_BY_PUBLISHER -> sortBooksByPublisher();
		case MenueOptions.EXIT -> runFlag = false;
		default -> errFlag = true;
		}

		boolean[] out = { runFlag, errFlag };
		return out;
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
}
