package lab5.task_5_3.fs;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

import lab5.task_5_3.encoder.CharEncoder;

public class FileEncodeSystem {

	CharEncoder encoder;

	public FileEncodeSystem(CharEncoder encoder) {
		this.encoder = encoder;
	}

	public void encodeData(String targetPath, String data) throws IOException {
		FilterOutputStream stream = null;
		try {
			stream = new FilterOutputStream(new FileOutputStream(targetPath));

			char[] dataChars = data.toCharArray();
			for (char c : dataChars) {
				stream.write((int) encoder.encode(c));
			}
			stream.flush();
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}

	public void encodeFile(String targetPath, String encodePath) throws IOException {
		FilterOutputStream stream = null;
		try {
			stream = new FilterOutputStream(new FileOutputStream(targetPath));
			String data = readFile(encodePath);
			for (char c : data.toCharArray()) {
				stream.write((int) encoder.encode(c));
			}
			stream.flush();
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}

	public void decodeFile(String targetPath, String decodePath) throws IOException {
		FilterInputStream stream = null;
		try {
			stream = new BufferedInputStream(new FileInputStream(decodePath));
			String data = null;
			byte[] bytes = stream.readAllBytes();
			for (byte b : bytes) {
				data += encoder.decode((char) b);
			}
			writeFile(targetPath, data);
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}

	public String readFile(String filepath) throws IOException {
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

	private void writeFile(String filepath, String data) throws IOException {
		DataOutputStream stream = null;
		try {
			stream = new DataOutputStream(new FileOutputStream(filepath));
			stream.writeChars(data);
			;
		} finally {
			if (stream != null) {
				stream.close();
			}
		}
	}
}
