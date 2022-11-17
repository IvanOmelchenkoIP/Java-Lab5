package lab5.task_5_2.book;

public class Book {

	private String name;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private double price;

	public Book(String name, String author, String publisher, int year, int pages, double price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		String outName = "name: " + name + ", ";
		String outAuthor = "author: " + author + ", ";
		String outPublisher = "publisher: " + publisher + ", ";
		String outYear = "year: " + Integer.toString(year) + ", ";
		String outPages = "pages: " + Integer.toString(pages) + ", ";
		String outPrice = "price: " + Double.toString(price);
		return "Book info: {" + outName + outAuthor + outPublisher + outYear + outPages + outPrice + "}";
	}
}
