package lab5.task_5_1;

import lab5.task_5_1.freader.FileDataReader;
import lab5.task_5_1.strprocessor.*;

public class Main {

	public static void main(String[] args) {
		FileDataReader fr = new FileDataReader();
		String data = null;
		try {
			data = fr.read("./src/lab5/task_5_1/test_files/test.txt");
		} catch(Exception ex) {
			System.out.print(1);
			System.out.println(ex.getMessage());
		}
		if (data == null) return;
		StringProcessorController sp = new StringProcessorController(new StringProcessorModel(), new StringProcessorView());
		sp.mostWordsLine(data);
	}

}
