package lab5.task_5_2.book.array;

import java.util.ArrayList;

import lab5.task_5_2.book.Book;

public class FileBookStorage {
	ArrayList<Book> storage;
	
	public FileBookStorage() {
		storage = new ArrayList<Book>();
	}
	
	public void setStorage(ArrayList<Book> list) {
		storage = list;
	}
	
	public ArrayList<Book> getStorage() {
		return storage;
	}
}
