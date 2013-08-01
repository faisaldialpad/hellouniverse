package unittests;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import strings.HTMLTagsDetection;

public class HTMLTagsDetectionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testToStringLexicographically() {
		
		assertEquals("a;div;p", HTMLTagsDetection.toStringLexicographically(new String[]{"<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>","<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>"}));

		
	}

}
