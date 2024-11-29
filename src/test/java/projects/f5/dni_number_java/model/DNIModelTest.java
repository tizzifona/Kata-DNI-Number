package projects.f5.dni_number_java.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DNIModelTest {

    private DNIModel model;

    @BeforeEach
    void setup() {
        model = new DNIModel();
    }

    @Test
    void testCalculateNIFLetter() {
        assertThat(model.calculateNIFLetter(12345678), is('Z'));
        assertThat(model.calculateNIFLetter(0), is('T'));
        assertThat(model.calculateNIFLetter(99999999), is('R'));
    }

    @Test
    void testCalculateNIFLetterNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> model.calculateNIFLetter(-1));
        assertThat(exception.getMessage(), is("DNI number must be between 0 and 99999999."));
    }

    @Test
    void testCalculateNIFLetterInputOutOfRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> model.calculateNIFLetter(100000000));
        assertThat(exception.getMessage(), is("DNI number must be between 0 and 99999999."));
    }
}
