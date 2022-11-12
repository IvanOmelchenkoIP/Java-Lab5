package lab5.task_5_1.menu;

import lab5.task_5_1.FileDataReader;
import lab5.task_5_1.StringProcessor;

class MenuOptions {
	public final static String MENU_READ_FILE = "1";
	public final static String MENU_EXIT = "2";
}

public class MenuModel {
	private FileDataReader fr;
	private StringProcessor sp;
	
	public void addControllers(FileDataReader fr, StringProcessor sp) {
		this.fr = fr;
		this.sp = sp;
	}
	
	public int processCommand(String command) {
		int status;
		switch(command) {
		case MenuOptions.MENU_READ_FILE -> status = MenuStates.STATUS_READ_FILE;
		case MenuOptions.MENU_EXIT -> status = MenuStates.STATUS_EXIT;
		default -> status = MenuStates.STATUS_INCORRECT_COMMAND;
		} 
		return status;
	}
}
