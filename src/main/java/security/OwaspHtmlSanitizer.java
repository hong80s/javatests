package security;

import org.owasp.html.PolicyFactory;
import org.owasp.html.Sanitizers;

public class OwaspHtmlSanitizer {
	
	
	public String defaultSanitizer() {
		PolicyFactory policy = Sanitizers.FORMATTING.and(Sanitizers.LINKS);
		return policy.sanitize(getUntrustedHtml());
	}
	
	private String getUntrustedHtml() {
		return "normal text \n <script>alert('XSS')</script>"
				.concat("<a href=\"alert('XSS')\"></a>")
				.concat("<img src=x onerror=alert('XSS-img') />");
	}

}
