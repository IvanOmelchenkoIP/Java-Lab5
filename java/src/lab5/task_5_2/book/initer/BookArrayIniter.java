package lab5.task_5_2.book.initer;

import java.util.Random;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

import lab5.task_5_2.book.Book;
import lab5.task_5_2.book.array.BookArrayModel;

public class BookArrayIniter {

	private static final int MIN_AMOUNT = 10;
	private static final Book[] BOOKS_DATA = { new Book("BookName1", "Author1", "Publisher1", 1998, 234, 120.99),
			new Book("BookName2", "Author1", "Publisher1", 2001, 324, 200.50),
			new Book("BookName3", "Author1", "Publisher1", 2002, 475, 310.25),
			new Book("BookName4", "Author1", "Publisher2", 2002, 209, 105.00),
			new Book("BookName5", "Author1", "Publisher2", 2003, 489, 290.99),
			new Book("BookName6", "Author2", "Publisher2", 2004, 507, 350.99),
			new Book("BookName7", "Author2", "Publisher1", 2005, 270, 150.99),
			new Book("BookName8", "Author3", "Publisher3", 2003, 214, 115.50),
			new Book("BookName9", "Author4", "Publisher3", 2004, 120, 104.60),
			new Book("BookName10", "Author4", "Publisher3", 2006, 704, 435.99),
			new Book("BookName11", "Author4", "Publisher3", 2001, 307, 205.70),
			new Book("BookName12", "Author5", "Publisher1", 2004, 248, 210.50),
			new Book("BookName13", "Author5", "Publisher1", 2004, 485, 370.99),
			new Book("BookName14", "Author6", "Publisher4", 2004, 903, 460.75),
			new Book("BookName15", "Author7", "Publisher4", 2006, 400, 286.75),
			new Book("BookName16", "Author8", "Publisher1", 2001, 198, 110.99),
			new Book("BookName17", "Author8", "Publisher1", 2003, 590, 346.00),
			new Book("BookName18", "Author8", "Publisher4", 2003, 528, 205.45),
			new Book("BookName19", "Author8", "Publisher4", 2005, 301, 251.99),
			new Book("BookName20", "Author8", "Publisher4", 2007, 204, 102.99), };

	public static void init(BookArrayModel model) {
		Random random = new Random();
		int amount = random.nextInt((BOOKS_DATA.length - MIN_AMOUNT) + 1) + MIN_AMOUNT;

		ArrayList<Book> booksList = new ArrayList<Book>(Arrays.asList(BOOKS_DATA));
		Collections.shuffle(booksList);

		int first = random.nextInt((BOOKS_DATA.length - amount));
		for (int i = first; i < (first + amount); i++) {
			model.addBook(booksList.get(i));
		}
	}
}
