package lab5.task_5_2.book.comparator;

import java.util.Comparator;

import lab5.task_5_2.book.Book;

public class BookPublisherComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getPublisher().compareTo(book2.getPublisher());
	}
}