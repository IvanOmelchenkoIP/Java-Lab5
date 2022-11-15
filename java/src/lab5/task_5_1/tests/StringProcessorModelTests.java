package lab5.task_5_1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lab5.task_5_1.strprocessor.StringProcessorModel;

class StringProcessorModelTests {
	
	@Test
	void TestStringProcessorLineEmpty() {	
		String line = "";
		StringProcessorModel sp = new StringProcessorModel();
		boolean value = sp.lineEmpty(line);	
		
		assertTrue(value);
	}
	
	@Test
	void TestStringProcessorLineEmptyNoNonSpaceSymbols() {	
		String line = "   \n  ";
		StringProcessorModel sp = new StringProcessorModel();
		boolean value = sp.lineEmpty(line);	
		
		assertTrue(value);
	}
	
	@Test
	void TestStringProcessorLineEmptyNonSpaceSymbols() {	
		String line = "   1234\n  ";
		StringProcessorModel sp = new StringProcessorModel();
		boolean value = sp.lineEmpty(line);	
		
		assertFalse(value);
	}
	
	@Test
	void TestFindMostWordsLineEmptyLine() {
		String expected = "";
		
		String line = "";
		StringProcessorModel sp = new StringProcessorModel();
		String value = sp.mostWordsLine(line);	
		
		assertEquals(expected, value);
	}
	
	@Test
	void TestFindMostWordsLineSingleLine() {
		String expected = "single line";
		
		String line = "single line";
		StringProcessorModel sp = new StringProcessorModel();
		String value = sp.mostWordsLine(line);	
		
		assertEquals(expected, value);
	}
	
	@Test
	void TestFindMostWordsLineMultipleLines() {
		String expected = "line with most words";
		
		String line = "single line\nline with most words\nanother line";
		StringProcessorModel sp = new StringProcessorModel();
		String value = sp.mostWordsLine(line);	
		
		assertEquals(expected, value);
	}
	
	@Test
	void TestFindMostWordsLineMultipleLinesSame() {
		String expected = "line with most words";
		
		String line = "single line\nline with most words\nline   with most words  ";
		StringProcessorModel sp = new StringProcessorModel();
		String value = sp.mostWordsLine(line);	
		
		assertEquals(expected, value);
	}
}
