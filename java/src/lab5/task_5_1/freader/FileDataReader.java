package lab5.task_5_1.freader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileDataReader {

	public String read(String filepath) throws IOException {
		ObjectInputStream os = null;
		try {
			os = new ObjectInputStream(new FileInputStream(filepath));
			return os.readUTF();
		} finally {
			if (os != null) {
				os.close();
			}
		}
	}

}
