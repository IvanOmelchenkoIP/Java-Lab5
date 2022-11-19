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
			
		}
		scanner.close();
	}
	
	private void processCommmand(String input) {
		int state = model.processCommand(input);
		switch(state) {
		case MenuStates.STATUS_INCORRECT_COMMAND -> view.showMessage(MenuView.COMMAND_ERROR);
		case MenuStates.STATUS_EXIT -> runFlag = false;
		case MenuStates.STATUS_ENCODE_DATA -> encodeData();
		case MenuStates.STATUS_ENCODE_FILE -> encodeFile();
		case MenuStates.STATUS_DECODE_FILE -> decodeFile();
		}
	}
	
	private void encodeData() {
		
	}
	
	private void encodeFile() {
		
	}
	
	private void decodeFile() {
		
	}
}
