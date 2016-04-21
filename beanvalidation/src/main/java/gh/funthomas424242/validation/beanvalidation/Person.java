package gh.funthomas424242.validation.beanvalidation;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Person {

	@NotNull
	protected String name;

	@NotNull
	protected String vorname;

	protected Date geburtsdatum;

	public Person() {

	}

	public Person(final String name, final String vorname) {
		this.vorname = vorname;
		this.name = name;
	}

}
