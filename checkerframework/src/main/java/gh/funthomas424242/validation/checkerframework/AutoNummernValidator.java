package gh.funthomas424242.validation.checkerframework;

import java.util.Set;

import org.checkerframework.checker.regex.qual.Regex;

public class AutoNummernValidator {

	protected Set<@Regex(1) String> autoNummerPattern;

	public AutoNummernValidator(final Set<@Regex(1) String> pattern) {
		this.autoNummerPattern = pattern;
	}

	// Please uncomment to test -> static analyse -> compile error
	// public static void main(final String[] args) {
	// final Object myObject = null;
	// System.out.println(myObject.toString());
	// }

}
