package lab5.task_5_3.menu;

import lab5.task_5_3.fs.FileEncodeSystem;
import lab5.task_5_3.scanner.InputScanner;

public class MenuController {

	private boolean runFlag;
	
	private MenuModel model;
	private MenuView view;
	
	public MenuController(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}
	
	public void launch(InputScanner scanner, FileEncodeSystem fs) {
		runFlag = true;
		model.addControllers(fs);
		
		while(runFlag) {
			view.showMessage(MenuView.MENU);
			view.showMessage(MenuView.MENU_INPUT_FIELD);
			String input = scanner.scanInput();
			int state = model.processCommand(input);
			processMenuState(state, scanner);
		}
		scanner.close();
	}
	
	private void processMenuState(int state, InputScanner scanner) {
		switch(state) {
		case MenuStates.STATUS_INCORRECT_COMMAND -> view.showMessage(MenuView.COMMAND_ERROR);
		case MenuStates.STATUS_EXIT -> runFlag = false;
		case MenuStates.STATUS_ENCODE_DATA -> encodeData(scanner);
		case MenuStates.STATUS_ENCODE_FILE -> encodeFile(scanner);
		case MenuStates.STATUS_DECODE_FILE -> decodeFile(scanner);
		}
	}
	
	private void encodeData(InputScanner scanner) {
		view.showMessage(MenuView.TARGET_FILE_INPUT_FIELD);
		String targetPath = scanner.scanInput();
		view.showMessage(MenuView.ENCODED_DATA_INPUT_FIELD);
		String data = scanner.scanInput();
		try {
			model.encodeData(targetPath, data);
			view.showMessage(MenuView.OPERATION_SUCCESS);
		} catch(Exception exception) {
			view.showException(MenuView.FILE_ERROR, exception);
		}
	}
	
	private void encodeFile(InputScanner scanner) {
		view.showMessage(MenuView.TARGET_FILE_INPUT_FIELD);
		String targetPath = scanner.scanInput();
		view.showMessage(MenuView.ENCODED_FILE_INPUT_FIELD);
		String encodePath = scanner.scanInput();
		try {
			model.encodeFile(targetPath, encodePath);
			view.showMessage(MenuView.OPERATION_SUCCESS);
		} catch(Exception exception) {
			view.showException(MenuView.FILE_ERROR, exception);
		}
	}
	
	private void decodeFile(InputScanner scanner) {
		view.showMessage(MenuView.TARGET_FILE_INPUT_FIELD);
		String targetPath = scanner.scanInput();
		view.showMessage(MenuView.DECODED_FILE_INPUT_FIELD);
		String decodePath = scanner.scanInput();
		try {
			model.decodeFile(targetPath, decodePath);
			view.showMessage(MenuView.OPERATION_SUCCESS);
		} catch(Exception exception) {
			view.showException(MenuView.FILE_ERROR, exception);
		}
	}
}
