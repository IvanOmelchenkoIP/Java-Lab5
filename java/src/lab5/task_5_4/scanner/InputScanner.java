package lab5.task_5_4.scanner;

import java.util.Scanner;

public class InputScanner {

	private Scanner scanner;

	public InputScanner() {
		scanner = new Scanner(System.in);
	}

	public String scanInput() {
		return scanner.nextLine();
	}

	public void close() {
		scanner.close();
	}
}