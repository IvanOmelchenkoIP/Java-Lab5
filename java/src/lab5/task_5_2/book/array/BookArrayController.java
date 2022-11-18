package lab5.task_5_2.book.array;

import java.util.ArrayList;
import java.util.Arrays;

import lab5.task_5_2.book.Book;
import lab5.task_5_2.book.initer.BookArrayIniter;

public class BookArrayController {
	private BookArrayModel model;
	private BookArrayView view;
	private FileBookStorage storage;

	public BookArrayController(BookArrayModel model, BookArrayView view, FileBookStorage storage) {
		this.model = model;
		this.view = view;
		this.storage = storage;
	}

	public void initBookArray() {
		BookArrayIniter.init(model);
		ArrayList<Book> bookList = model.getBooks();
		storage.setStorage(bookList);
		view.printInitMessage(bookList);
	}

	public ArrayList<Book> getFileStorage() {
		return storage.getStorage();
	}

	public void setFileStorage(Object data) {
		if (data.getClass() != ArrayList.class || ((ArrayList<Book>) data).get(0).getClass() != Book.class) {
			view.printOperationMessage(data, BookArrayView.ERR_READ_FROM_FILE_FORMAT);
		} else {
			ArrayList<Book> list = (ArrayList<Book>) data;
			storage.setStorage(list);
			view.printOperationMessage(data, BookArrayView.SUCCESS_READ_FROM_FILE);
		}
	}

	public void resetFileStorage() {
		storage.setStorage(model.getBooks());
	}

	public void getBooksOfAuthor(String author) {
		ArrayList<Book> selected = model.getBooksOfAuthor(author);
		storage.setStorage(selected);
		String msgSuccess = BookArrayView.SUCCESS_SELECT_BY_AUTHOR;
		String msgFail = BookArrayView.ERR_SELECT_BY_AUTHOR;
		view.printOperationMessage(selected, msgSuccess, msgFail, author);
	}

	public void getBooksOfPublisher(String publisher) {
		ArrayList<Book> selected = model.getBooksOfAuthor(publisher);
		storage.setStorage(selected);
		String msgSuccess = BookArrayView.ERR_SELECT_BY_PUBLISHER;
		String msgFail = BookArrayView.ERR_SELECT_BY_PUBLISHER;
		view.printOperationMessage(selected, msgSuccess, msgFail, publisher);
	}

	public void getBooksAfterYear(int year) {
		ArrayList<Book> selected = model.getBooksAfterYear(year);
		storage.setStorage(selected);
		String msgSuccess = BookArrayView.SUCCESS_SELECT_AFTER_YEAR;
		String msgFail = BookArrayView.ERR_SELECT_AFTER_YEAR;
		view.printOperationMessage(selected, msgSuccess, msgFail, year);
	}

	public void sortBooksByPublisher() {
		ArrayList<Book> sorted = model.sortBooksByPublisher();
		storage.setStorage(sorted);
		String msgSuccess = BookArrayView.SUCCESS_SORT_BY_PUBLISHER;
		String msgFail = BookArrayView.ERR_SORT_BY_PUBLISHER;
		view.printOperationMessage(sorted, msgSuccess, msgFail);
	}
}
