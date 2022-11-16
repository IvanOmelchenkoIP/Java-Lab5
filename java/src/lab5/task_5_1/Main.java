package lab5.task_5_1;

import lab5.task_5_1.fs.FileProcessSystem;
import lab5.task_5_1.menu.*;
import lab5.task_5_1.scanner.InputScanner;
import lab5.task_5_1.strprocessor.*;

public class Main {

	public static void main(String[] args) {
		// ./test_files/5_1/non-existant.txt
		// ./test_files/5_1/empty.txt
		// ./test_files/5_1/single-line.txt
		// ./test_files/5_1/multiple-line.txt

		MenuModel model = new MenuModel();
		MenuView view = new MenuView();

		MenuController menu = new MenuController(model, view);

		InputScanner scanner = new InputScanner();
		FileProcessSystem fs = new FileProcessSystem();
		StringProcessorModel sm = new StringProcessorModel();
		StringProcessorView sv = new StringProcessorView();
		StringProcessorController sp = new StringProcessorController(sm, sv);

		menu.launch(scanner, fs, sp);
	}
}
