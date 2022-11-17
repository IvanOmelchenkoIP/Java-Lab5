package lab5.task_5_2.book.datagenerator;

import java.util.Random;

public class ProcessingDataGenerator {

	public static final String[] AUTHORS = { "Author1", "Author2", "Author3", "Author4", "Author5", "Author6", "Author7", "Author8" };
	public static final String[] PUBLISHERS = { "Publisher1", "Publisher2", "Publisher3", "Publisher4" };
	public static final int[] YEARS = { 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007 };

	public static String getRandomElement(String[] array) {
		Random random = new Random();
		int index = random.nextInt(array.length);
		return array[index];
	}

	public static int getRandomElement(int[] array) {
		Random random = new Random();
		int index = random.nextInt(array.length);
		return array[index];
	}
}
