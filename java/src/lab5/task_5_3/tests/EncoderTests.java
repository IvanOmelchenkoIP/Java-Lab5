package lab5.task_5_3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab5.task_5_3.encoder.CharIncEncoder;

class EncoderTests {

	@Test
	void TestEncodeLetter() {
		char expected = 'c';

		char c = 'b';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.encode(c);

		assertEquals(expected, result);
	}

	@Test
	void TestEncodeNumber() {
		char expected = ':';

		char c = '9';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.encode(c);

		assertEquals(expected, result);
	}

	@Test
	void TestEncodeSymbol() {
		char expected = '"';

		char c = '!';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.encode(c);

		assertEquals(expected, result);
	}

	@Test
	void TestEncodeNewLine() {
		char expected = '';

		char c = '\n';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.encode(c);
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	void TestDecodeLetter() {
		char expected = 'r';

		char c = 's';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.decode(c);
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	void TestDecodeNumber() {
		char expected = '/';

		char c = '0';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.decode(c);
		System.out.println(result);

		assertEquals(expected, result);
	}

	@Test
	void TestDecodeSymbol() {
		char expected = 'z';

		char c = '{';
		CharIncEncoder encoder = new CharIncEncoder();
		char result = encoder.decode(c);
		System.out.println(result);

		assertEquals(expected, result);
	}
}
