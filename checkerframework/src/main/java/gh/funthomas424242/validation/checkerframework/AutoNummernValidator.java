package gh.funthomas424242.validation.checkerframework;

import org.checkerframework.checker.regex.qual.Regex;

public class AutoNummernValidator {

	@Regex(1)
	protected String autoNummerPattern;

	public AutoNummernValidator(final String pattern) {
		this.autoNummerPattern = pattern;
	}

}
