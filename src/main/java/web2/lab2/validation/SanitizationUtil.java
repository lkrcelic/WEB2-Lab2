package web2.lab2.validation;

import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;

public class SanitizationUtil {

    private static final PolicyFactory POLICY = new HtmlPolicyBuilder()
        .allowCommonBlockElements()
        .allowCommonInlineFormattingElements()
        .toFactory();

    public static String sanitize(String input) {
        if (input == null) {
            return null;
        }
        return POLICY.sanitize(input);
    }
}
