package lab5.task_5_1.tests;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import lab5.task_5_1.fs.FileProcessSystem;

class FileSystemTests {

	@Test
	void TestReadFileNonExistantFile() {
		FileProcessSystem fs = new FileProcessSystem();
		IOException exception = assertThrows(IOException.class, () -> {
			fs.read("./test_files/5_1/non-existant.txt");
		});

		assertTrue(exception instanceof FileNotFoundException);
	}

	@Test
	void TestReadFileEmptyFile() {
		String expected = "";

		FileProcessSystem fs = new FileProcessSystem();
		try {
			String value = fs.read("./test_files/5_1/empty.txt");
			assertEquals(expected, value);
		} catch (Exception exception) {
			fail("Should return string!");
		}
	}

	@Test
	void TestReadFileSingleLineFile() {
		String expected = "single line";

		FileProcessSystem fs = new FileProcessSystem();
		try {
			String value = fs.read("./test_files/5_1/single-line.txt");
			assertEquals(expected, value);
		} catch (Exception exception) {
			fail("Should return string!");
		}
	}

	@Test
	void TestReadFileMultipleLineFile() {
		String expected = "this is a line\r\n" 
				+ "this line has more words\r\n" 
				+ "this line has same words\r\n"
				+ "smallest line";

		FileProcessSystem fs = new FileProcessSystem();
		try {
			String value = fs.read("./test_files/5_1/multiple-line.txt");
			assertEquals(expected, value);
		} catch (Exception exception) {
			fail("Should return string!");
		}
	}

}
