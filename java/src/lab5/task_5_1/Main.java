package lab5.task_5_1;

import lab5.task_5_1.fs.FileSystem;
import lab5.task_5_1.menu.*;
import lab5.task_5_1.scanner.InputScanner;
import lab5.task_5_1.strprocessor.*;

public class Main {

	public static void main(String[] args) {
		// ./src/lab5/task_5_1/test_files/test.txt
		
		MenuModel model = new MenuModel();
		MenuView view = new MenuView();
		
		MenuController menu = new MenuController(model, view);
		
		InputScanner scanner = new InputScanner();
		FileSystem fs = new FileSystem();
		StringProcessorModel sm = new StringProcessorModel();
		StringProcessorView sv = new StringProcessorView();
		StringProcessorController sp = new StringProcessorController(sm, sv);
		
		menu.launch(scanner, fs, sp);
	}

}
