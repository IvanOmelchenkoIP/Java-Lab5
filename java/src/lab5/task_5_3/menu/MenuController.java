package lab5.task_5_3.menu;

import lab5.task_5_3.fs.FileEncodeSystem;
import lab5.task_5_3.scanner.InputScanner;

public class MenuController {

	MenuModel model;
	MenuView view;
	
	public MenuController(MenuModel model, MenuView view) {
		this.model = model;
		this.view = view;
	}
	
	public void launch(InputScanner scanner, FileEncodeSystem fs) {
		
	}
}
