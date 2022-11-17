package lab5.task_5_2.book.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import lab5.task_5_2.book.Book;
import lab5.task_5_2.book.comparator.BookPublisherComparator;

public class BookArrayModel {

	private ArrayList<Book> books;

	public BookArrayModel() {
		books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Book> getBooksOfAuthor(String author) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getAuthor() == author) {
				selected.add(book);
			}
		}
		return selected;
	}

	public ArrayList<Book> getBooksOfPublisher(String publisher) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getPublisher() == publisher) {
				selected.add(book);
			}
		}
		return selected;
	}

	public ArrayList<Book> getBooksAfterYear(int year) {
		ArrayList<Book> selected = new ArrayList<Book>();
		for (Book book : books) {
			if (book.getYear() > year) {
				selected.add(book);
			}
		}
		return selected;
	}

	public ArrayList<Book> sortBooksByPublisher() {
		Comparator<Book> comparator = new BookPublisherComparator();
		ArrayList<Book> sorted = new ArrayList<Book>(books);
		Collections.sort(sorted, comparator);
		return sorted;
	}
}
