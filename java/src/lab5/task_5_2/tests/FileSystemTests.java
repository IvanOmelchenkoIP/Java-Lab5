package lab5.task_5_2.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import lab5.task_5_2.fs.FileObjectSystem;

class FileSystemTests {

	@Test
	void TestFileOutputNonExistantFolder() {
		String filepath = "./test_files/5-2/test.txt";
		String object = "An object to read";
		
		FileObjectSystem fs = new FileObjectSystem();
		Exception exception = assertThrows(IOException.class, () -> {
			fs.write(filepath, object);
		});
		
		assertTrue(exception instanceof IOException);
	}
	
	@Test
	void TestFileOutputType() {
		String filepath = "./test_files/5_2/test.txt";
		ArrayList<String> object = new ArrayList<String>();		
		
		FileObjectSystem fs = new FileObjectSystem();
		try {
			fs.write(filepath, object);
			Object received = fs.read(filepath);
			assertTrue(received.getClass() == ArrayList.class);
		} catch (Exception exception) {
			fail(exception);
		}
	}
	
	@Test
	void TestFileOutputContentEmpty() {
		String filepath = "./test_files/5_2/test.txt";
		ArrayList<String> object = null;
		
		FileObjectSystem fs = new FileObjectSystem();
		try {
			fs.write(filepath, object);
			Object received = fs.read(filepath);
			assertEquals(object, received);
		} catch (Exception exception) {
			fail(exception);
		}
	}
	
	@Test
	void TestFileOutputContentsFilled() {
		String filepath = "./test_files/5_2/test.txt";
		Object object = "An object to read";
		
		FileObjectSystem fs = new FileObjectSystem();
		try {
			fs.write(filepath, object);
			Object received = fs.read(filepath);
			assertEquals(object, received);
		} catch (Exception exception) {
			fail(exception);
		}
	}
	
	@Test 
	void TestReadNonExistantFile() {
		String filepath = "./test_files/5_2/non-existant.txt";
		
		FileObjectSystem fs = new FileObjectSystem();
		Exception exception = assertThrows(Exception.class, () -> {
			fs.read(filepath);
		});
		
		assertTrue(exception instanceof IOException);
	}

}
