package lab5.task_5_4;

import lab5.task_5_4.fs.FileUrlSystem;
import lab5.task_5_4.menu.*;
import lab5.task_5_4.scanner.InputScanner;

public class Main {

	public static void main(String[] args) {

		MenuModel model = new MenuModel();
		MenuView view = new MenuView();

		MenuController menu = new MenuController(model, view);

		InputScanner scanner = new InputScanner();
		FileUrlSystem fs = new FileUrlSystem();

		menu.launch(scanner, fs);
	}
}