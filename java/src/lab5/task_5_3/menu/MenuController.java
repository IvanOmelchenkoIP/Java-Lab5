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
}
