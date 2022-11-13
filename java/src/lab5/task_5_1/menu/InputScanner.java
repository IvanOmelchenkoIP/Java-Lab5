package lab5.task_5_1.menu;

import java.util.Scanner;

public class InputScanner {
	
	public static String scan() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}
}