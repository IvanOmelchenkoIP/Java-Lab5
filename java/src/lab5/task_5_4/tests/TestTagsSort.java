package lab5.task_5_4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

import lab5.task_5_4.tags.TagAnalyserModel;

class TestTagsSort {

	@Test
	void TestSortByAlphabetEmpty() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByAlphabet(tags);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestSortByAlphabetSingle() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("a", 3);

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		tags.put("a", 3);
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByAlphabet(tags);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestSortByAlphabetMultiple() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("a", 3);
		expected.put("h1", 1);
		expected.put("h2", 1);
		expected.put("p", 2);

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		tags.put("p", 2);
		tags.put("h2", 1);
		tags.put("a", 3);
		tags.put("h1", 1);
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByAlphabet(tags);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestSortByOccurenceEmpty() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByOccurence(tags);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestSortByOccurenceSingle() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("a", 3);

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		tags.put("a", 3);
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByOccurence(tags);

		assertTrue(expected.equals(result));
	}
	
	@Test
	void TestSortByOccurenceMultiple() {
		HashMap<String, Integer> expected = new LinkedHashMap<String, Integer>();
		expected.put("h1", 1);
		expected.put("a", 1);
		expected.put("li", 3);
		expected.put("h2", 4);
		expected.put("p", 5);

		HashMap<String, Integer> tags = new LinkedHashMap<String, Integer>();
		tags.put("h1", 1);
		tags.put("h2", 4);
		tags.put("li", 3);
		tags.put("a", 1);
		tags.put("p", 5);
		TagAnalyserModel model = new TagAnalyserModel();
		HashMap<String, Integer> result = model.sortTagsByOccurence(tags);

		assertTrue(expected.equals(result));
	}

}
