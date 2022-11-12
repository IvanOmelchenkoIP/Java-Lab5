package lab5.task_5_1;

import lab5.task_5_1.fs.FileSystem;
import lab5.task_5_1.strprocessor.*;

public class Main {

	public static void main(String[] args) {
		FileSystem fs = new FileSystem();
		String data = null;
		try {
			data = fs.read("./src/lab5/task_5_1/test_files/test.txt");
		} catch(Exception ex) {
			System.out.print(1);
			System.out.println(ex.getMessage());
		}
		if (data == null) return;
		StringProcessorController sp = new StringProcessorController(new StringProcessorModel(), new StringProcessorView());
		sp.mostWordsLine(data);
	}

}
