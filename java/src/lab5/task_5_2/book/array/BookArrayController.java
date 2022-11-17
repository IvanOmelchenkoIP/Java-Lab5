package lab5.task_5_2.book.array;

import java.util.ArrayList;

import lab5.task_5_2.book.Book;
import lab5.task_5_2.book.initer.BookArrayIniter;

public class BookArrayController {
	private BookArrayModel model;
	private BookArrayView view;

	public BookArrayController(BookArrayModel model, BookArrayView view) {
		this.model = model;
		this.view = view;
	}

	public void initBookArray() {
		BookArrayIniter.init(model);
		ArrayList<Book> bookList = model.getBooks();
		view.printInitMessage(bookList);
	}

	public void getBooksOfAuthor(String author) {
		ArrayList<Book> selected = model.getBooksOfAuthor(author);
		String msgSuccess = BookArrayView.SUCCESS_SELECT_BY_AUTHOR;
		String msgFail = BookArrayView.ERR_SELECT_BY_AUTHOR;
		view.printOperationMessage(selected, msgSuccess, msgFail, author);
	}

	public void getBooksOfPublisher(String publisher) {
		ArrayList<Book> selected = model.getBooksOfAuthor(publisher);
		String msgSuccess = BookArrayView.ERR_SELECT_BY_PUBLISHER;
		String msgFail = BookArrayView.ERR_SELECT_BY_PUBLISHER;
		view.printOperationMessage(selected, msgSuccess, msgFail, publisher);
	}

	public void getBooksAfterYear(int year) {
		ArrayList<Book> selected = model.getBooksAfterYear(year);
		String msgSuccess = BookArrayView.SUCCESS_SELECT_AFTER_YEAR;
		String msgFail = BookArrayView.ERR_SELECT_AFTER_YEAR;
		view.printOperationMessage(selected, msgSuccess, msgFail, year);
	}

	public void sortBooksByPublisher() {
		ArrayList<Book> selected = model.sortBooksByPublisher();
		String msgSuccess = BookArrayView.SUCCESS_SORT_BY_PUBLISHER;
		String msgFail = BookArrayView.ERR_SORT_BY_PUBLISHER;
		view.printOperationMessage(selected, msgSuccess, msgFail);
	}
}
