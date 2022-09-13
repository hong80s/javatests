package security;

import static org.junit.Assert.*;

import org.junit.Test;

public class OwaspHtmlSanitizerTest {

	@Test
	public void test() {
		OwaspHtmlSanitizer owaspHtmlSanitizer = new OwaspHtmlSanitizer();
		String safeHtml = owaspHtmlSanitizer.defaultSanitizer();
		boolean result = safeHtml.indexOf("alert")<0;
		System.out.println(safeHtml);
		assertTrue(result);
		//fail("Not yet implemented");
	}

}
