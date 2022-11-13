package lab5.task_5_1.scanner;

import java.util.Scanner;

public class InputScanner {
	
	public static String scanInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}
}