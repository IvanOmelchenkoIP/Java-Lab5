package lab5.task_5_1.menu;

public class MenuView {
	public static String MENU = "1) find longest line in file\n2) exit";
	public static String INPUT_FIELD = "Enter a corresponding number to continue: ";
	
	public static String INVALID_COMMAND = "Error! Invalid command!";
	
	public static String EXIT = "Exiting the program...";
	
	public void showMessage(String msg) {
		System.out.println(msg);
	}
}
