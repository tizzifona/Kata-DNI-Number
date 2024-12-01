package projects.f5.dni_number_java.view;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DNIViewTest {

    private DNIView view;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        view = new DNIView();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testDisplayNIF() {
        view.displayNIF(12345678, 'Z');

        String output = outputStream.toString();
        assertThat(output, containsString("Your NIF is: 12345678-Z"));

    }

    @Test
    void testDisplayError() {
        view.displayError("Test error message");

        String output = outputStream.toString();
        assertThat(output, containsString("Error: Test error message"));

    }

    @Test
    void testGetDNINumberWithValidInput() {
        InputStream originalIn = System.in;
        String validInput = "12345678\n";
        System.setIn(new ByteArrayInputStream(validInput.getBytes()));

        DNIView view = new DNIView();
        int result = view.getDNINumber();

        assertEquals(12345678, result);

        System.setIn(originalIn);
    }

    @Test
    void testGetDNINumberWithInvalidInput() {
        InputStream originalIn = System.in;
        String invalidInput = "abc\n12345678\n";
        System.setIn(new ByteArrayInputStream(invalidInput.getBytes()));

        DNIView view = new DNIView();
        int result = view.getDNINumber();

        assertEquals(12345678, result);

        System.setIn(originalIn);
    }

}
