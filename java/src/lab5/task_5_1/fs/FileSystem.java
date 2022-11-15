package lab5.task_5_1.fs;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileSystem {

	public String read(String filepath) throws IOException {
		DataInputStream stream = null;
		try {
			stream = new DataInputStream(new FileInputStream(filepath));
			String contents = new String(stream.readAllBytes(), StandardCharsets.UTF_8);

			return contents;
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}

}
