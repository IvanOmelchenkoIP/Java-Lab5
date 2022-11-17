package lab5.task_5_2.menu;

public class MenuView {

	public static String NEW_LINE = "\n";
	public static String MENU = "1) find books by random publisher\n" + "2) find books by random author\n"
			+ "3) find books after random year\n" + "4) sort books by publisher\n" + "5) reset write object\n"
			+ "6) write object to file\n" + "7) read object from file\n" + "8) exit\n";
	public static String INPUT_FIELD = "Enter a number corresponding menu item. Your input > ";
	public static String INVALID_COMMAND = "The command you chose is invalid! Please select a valid command...";
	public static String EXIT = "Exiting the program...\n";

	public void printMenuMessage(String message) {
		System.out.print(message);
	}
}
