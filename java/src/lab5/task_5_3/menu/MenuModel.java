package lab5.task_5_3.menu;

import java.io.IOException;

import lab5.task_5_3.fs.FileEncodeSystem;

class MenuOptions {

	public final static String MENU_ENCODE_DATA = "1";
	public final static String MENU_ENCODE_FILE = "2";
	public final static String MENU_DECODE_FILE = "3";
	public final static String MENU_EXIT = "4";
}

public class MenuModel {

	FileEncodeSystem fs;

	public void addControllers(FileEncodeSystem fs) {
		this.fs = fs;
	}

	public int processCommand(String command) {
		int status;
		switch (command) {
		case MenuOptions.MENU_ENCODE_DATA -> status = MenuStates.STATUS_ENCODE_DATA;
		case MenuOptions.MENU_ENCODE_FILE -> status = MenuStates.STATUS_ENCODE_FILE;
		case MenuOptions.MENU_DECODE_FILE -> status = MenuStates.STATUS_DECODE_FILE;
		case MenuOptions.MENU_EXIT -> status = MenuStates.STATUS_EXIT;
		default -> status = MenuStates.STATUS_INCORRECT_COMMAND;
		}
		return status;
	}

	public void encodeData(String targetPath, String data) throws IOException {
		try {
			fs.encodeData(targetPath, data);
		} catch (IOException exception) {
			throw exception;
		}
	}

	public void encodeFile(String targetPath, String encodePath) throws IOException {
		try {
			fs.encodeFile(targetPath, encodePath);
		} catch (IOException exception) {
			throw exception;
		}
	}

	public void decodeFile(String targetPath, String decodePath) throws IOException {
		try {
			fs.decodeFile(targetPath, decodePath);
		} catch (IOException exception) {
			throw exception;
		}
	}
}
