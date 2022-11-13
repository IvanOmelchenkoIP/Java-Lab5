package lab5.task_5_1.menu;

public class MenuView {
	
	public final static String MENU = "1) find longest line in file\n2) exit\n";
	public final static String MENU_INPUT_FIELD = "Enter a corresponding number to continue: ";
	
	public final static String FILE_INPUT_FIELD = "Enter a name of a file you want to process: ";
	
	public final static String COMMAND_ERROR = "Error! Invalid command!\n\n";
	
	public static final String FILE_ERROR = "Error! Error while attemptiong to read file!\n";
	
	public final static String EXIT = "Exiting the program...\n\n";

	public void showMessage(String msg) {
		System.out.print(msg);
	}
}
