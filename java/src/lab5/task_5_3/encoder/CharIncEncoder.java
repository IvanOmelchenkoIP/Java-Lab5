package lab5.task_5_3.encoder;

public class CharIncEncoder implements CharEncoder {

	public char encode(char c) {
		int encoded = (int) c + 1;
		return (char) encoded;
	}

	public char decode(char c) {
		int decoded = (int) c - 1;
		return (char) decoded;
	}
}
