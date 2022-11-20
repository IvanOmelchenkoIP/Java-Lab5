package lab5.task_5_4.menu;

public class MenuView {
	public final static String MENU = "1) sort url tags by aphabet\n" + "2) sort url tags by occurence\n" + "3) exit\n";
	public final static String MENU_INPUT_FIELD = "Enter a corresponding number to continue: ";

	public final static String URL_INPUT_FIELD = "Enter a url: ";
	
	public final static String TAGS_BY_ALPHABET = "Tags sorted in aphabetical order...\n\n";
	public final static String TAGS_BY_OCCURENCE = "Tags sorted in order of occurence...\n\n";

	public final static String COMMAND_ERROR = "Error! Invalid command!\n\n";

	public static final String FILE_ERROR = "Error! Error while attemptiong to read file!\n";

	public final static String EXIT = "Exiting the program...\n\n";

	public void showMessage(String msg) {
		System.out.print(msg);
	}

	public void showException(String msg, Exception exception) {
		System.out.println(msg);
		System.out.println(exception.getMessage() + "\n");
	}
}
