package lab5.task_5_3;

import lab5.task_5_3.menu.*;
import lab5.task_5_3.encoder.CharIncEncoder;
import lab5.task_5_3.fs.FileEncodeSystem;
import lab5.task_5_3.scanner.InputScanner;

public class Main {

	public static void main(String[] args) {
		MenuModel model = new MenuModel();
		MenuView view = new MenuView();
		MenuController menu = new MenuController(model, view);
		
		InputScanner scanner = new InputScanner();
		CharIncEncoder encoder = new CharIncEncoder();
		FileEncodeSystem fs = new FileEncodeSystem(encoder);
		
		menu.launch(scanner, fs);
	}

}
