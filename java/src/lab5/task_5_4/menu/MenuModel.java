package lab5.task_5_4.menu;

import java.io.IOException;

import lab5.task_5_4.fs.FileUrlSystem;
import lab5.task_5_4.tags.TagAnalyserController;

class MenuOptions {

	public final static String MENU_TAGS_BY_ALPHABET = "1";
	public final static String MENU_TAGS_BY_OCCURENCE = "2";
	public final static String MENU_EXIT = "3";
}

public class MenuModel {

	FileUrlSystem fs;
	TagAnalyserController tags;

	public void addControllers(FileUrlSystem fs, TagAnalyserController tags) {
		this.fs = fs;
		this.tags = tags;
	}

	public int processCommand(String command) {
		int status;
		switch (command) {
		case MenuOptions.MENU_TAGS_BY_ALPHABET -> status = MenuStates.STATUS_TAGS_BY_ALPHABET;
		case MenuOptions.MENU_TAGS_BY_OCCURENCE -> status = MenuStates.STATUS_TAGS_BY_OCCURENCE;
		case MenuOptions.MENU_EXIT -> status = MenuStates.STATUS_EXIT;
		default -> status = MenuStates.STATUS_INCORRECT_COMMAND;
		}
		return status;
	}

	public void tagsByAlphabet(String url) throws IOException {
		try {
			String html = fs.read(url);
			tags.sortTagsByAlphabet(html);
		} catch (IOException exception) {
			throw exception;
		}
	}

	public void tagsByOccurence(String url) throws IOException {
		try {
			String html = fs.read(url);
			tags.sortTagsByOccurence(html);
		} catch (IOException exception) {
			throw exception;
		}
	}
}