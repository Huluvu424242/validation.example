package gh.funthomas424242.validation.beanvalidation;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

public class PersonTest {

    //TODO junit5 - waiting until release
    protected Validator validator;

    @BeforeEach
    public void setUp() {
        final ValidatorFactory factory = Validation
            .buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testInvalidPerson() {
        final Person person = new Person();

        final Set<ConstraintViolation<Person>> constraintViolations = validator
            .validate(person);

        assertEquals(2, constraintViolations.size());
        final Iterator<ConstraintViolation<Person>> it = constraintViolations
            .iterator();
        assertTrue(isNameOrVornameNotNullMessage(it.next().getMessage()));
        assertTrue(isNameOrVornameNotNullMessage(it.next().getMessage()));
    }

    private static boolean isNameOrVornameNotNullMessage(final String message) {
        if ("name not null".equals(message))
            return true;
        if ("vorname not null".equals(message))
            return true;
        return false;
    }

    @Test
    public void testValidPerson() {
        final Person person = new Person("Mustermann", "Max");

        final Set<ConstraintViolation<Person>> constraintViolations = validator
            .validate(person);

        assertEquals(0, constraintViolations.size());

    }

}
