package lab5.task_5_2.book.array;

import java.util.ArrayList;

import lab5.task_5_2.book.Book;

public class BookArrayView {

	private final String ARRAY_FORMED = "Array of books has been filled successfully. Amout of books in the array";

	public static final String SUCCESS_SELECT_BY_AUTHOR = "Books written by the author";
	public static final String SUCCESS_SELECT_BY_PUBLISHER = "Books published by the publisher";
	public static final String SUCCESS_SELECT_AFTER_YEAR = "Books published after the year";

	public static final String SUCCESS_SORT_BY_PUBLISHER = "Sorted array of books by the publisher:";

	public static final String SUCCESS_READ_FROM_FILE = "Data has been successfully read from file";

	public static final String ERR_SELECT_BY_AUTHOR = "There is no data on books written by the author";
	public static final String ERR_SELECT_BY_PUBLISHER = "There is no data on books published by the publisher";
	public static final String ERR_SELECT_AFTER_YEAR = "There is no data on books published after the year";

	public static final String ERR_SORT_BY_PUBLISHER = "There is not a single book in the array to sort...";

	public static final String ERR_READ_FROM_FILE_FORMAT = "There is an error in the format of data that you are trying to read from file or there is no data to read";

	public void printInitMessage(ArrayList<Book> books) {
		System.out.printf("%s: %d\n", ARRAY_FORMED, books.size());
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public void printOperationMessage(Object object, String msg) {
		System.out.println(msg + "\n" + object);
	}

	public void printOperationMessage(ArrayList<Book> books, String msgSuccess, String msgError) {
		if (books.size() == 0) {
			System.out.println(msgError);
			return;
		}

		System.out.println(msgSuccess);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public void printOperationMessage(ArrayList<Book> books, String msgSuccess, String msgError, String criteria) {
		if (books.size() == 0) {
			System.out.printf("%s %s...\n", msgError, criteria);
			return;
		}

		System.out.printf("%s %s:\n", msgSuccess, criteria);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

	public void printOperationMessage(ArrayList<Book> books, String msgSuccess, String msgError, int criteria) {
		if (books.size() == 0) {
			System.out.printf("%s %d...\n", msgError, criteria);
			return;
		}

		System.out.printf("%s %d:\n", msgSuccess, criteria);
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}
