package projects.f5.dni_number_java.view;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import java.io.ByteArrayOutputStream;
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

}
