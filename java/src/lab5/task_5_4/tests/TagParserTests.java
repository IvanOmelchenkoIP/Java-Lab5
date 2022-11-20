package lab5.task_5_4.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import lab5.task_5_4.tags.TagsParser;

class TagParserTests {

	@Test
	void TestParserEmptyHtml() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();

		String html = "";
		TagsParser parser = new TagsParser();
		HashMap<String, Integer> result = parser.getTagsOccurenceFromHtml(html);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestParserNoTags() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();

		String html = "some data";
		TagsParser parser = new TagsParser();
		HashMap<String, Integer> result = parser.getTagsOccurenceFromHtml(html);

		assertTrue(expected.equals(result));
	}

	@Test
	void TestParserHtmlTagsPresent() {
		HashMap<String, Integer> expected = new HashMap<String, Integer>();
		expected.put("h1", 2);
		expected.put("a", 1);
		expected.put("p", 1);

		String html = "<p> Paragraph </p>\n<h1>head1</h1><h1>head2</h1><a href = \"\"></a>";
		TagsParser parser = new TagsParser();
		HashMap<String, Integer> result = parser.getTagsOccurenceFromHtml(html);

		assertTrue(expected.equals(result));
	}

}
