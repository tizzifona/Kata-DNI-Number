package projects.f5.dni_number_java.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import projects.f5.dni_number_java.model.DNIModel;
import projects.f5.dni_number_java.view.DNIView;

public class DNIControllerTest {

    @Mock
    private DNIModel model;

    @Mock
    private DNIView view;

    private DNIController controller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controller = new DNIController(model, view);
    }

    @Test
    void testRunWithValidInput() {

        int validDNI = 12345678;
        char expectedNIFLetter = 'Z';

        when(view.getDNINumber()).thenReturn(validDNI);
        when(model.calculateNIFLetter(validDNI)).thenReturn(expectedNIFLetter);

        controller.run();

        verify(view, times(1)).getDNINumber();
        verify(model, times(1)).calculateNIFLetter(validDNI);
        verify(view, times(1)).displayNIF(validDNI, expectedNIFLetter);
    }
}
