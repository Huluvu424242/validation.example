package gh.funthomas424242.validation.beanvalidation;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Person {

	@NotNull(message = "name not null")
	protected String name;

	@NotNull(message = "vorname not null")
	protected String vorname;

	protected Date geburtsdatum;

	public Person() {

	}

	public Person(final String name, final String vorname) {
		this.vorname = vorname;
		this.name = name;
	}

}
