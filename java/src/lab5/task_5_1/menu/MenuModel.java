package lab5.task_5_1.menu;

import java.io.IOException;

import lab5.task_5_1.fs.FileSystem;
import lab5.task_5_1.strprocessor.StringProcessorController;

class MenuOptions {
	public final static String MENU_READ_FILE = "1";
	public final static String MENU_EXIT = "2";
}

public class MenuModel {

	private FileSystem fs;
	private StringProcessorController sp;

	public void addControllers(FileSystem fs, StringProcessorController sp) {
		this.fs = fs;
		this.sp = sp;
	}

	public int processCommand(String command) {
		int status;
		switch (command) {
		case MenuOptions.MENU_READ_FILE -> status = MenuStates.STATUS_READ_FILE;
		case MenuOptions.MENU_EXIT -> status = MenuStates.STATUS_EXIT;
		default -> status = MenuStates.STATUS_INCORRECT_COMMAND;
		}
		return status;
	}

	public void processFile(String filepath) throws IOException {
		String data = null;
		try {
			data = fs.read(filepath);
		} catch (IOException exception) {
			throw exception;
		}
		if (data != null) {
			sp.mostWordsLine(data);
		}
	}

}
