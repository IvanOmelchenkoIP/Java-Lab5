package lab5.task_5_4.fs;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class FileUrlSystem {

	public String read(String url) throws IOException {
		DataInputStream stream = null;
		try {
			URL urlData = new URL(url);
			stream = new DataInputStream(urlData.openStream());
			String contents = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
			System.out.println(contents);
			return contents;
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}
}
