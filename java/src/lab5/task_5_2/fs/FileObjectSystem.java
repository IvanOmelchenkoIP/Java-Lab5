package lab5.task_5_2.fs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObjectSystem {

	public Object read(String filepath) throws IOException, ClassNotFoundException {
		ObjectInputStream stream = null;
		try {
			stream = new ObjectInputStream(new FileInputStream(filepath));
			return stream.readObject();
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}
	
	public void write (String filepath, Object obj) throws IOException {
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream(filepath));
			stream.writeObject(obj);
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}
}

