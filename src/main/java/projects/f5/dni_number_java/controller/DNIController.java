package projects.f5.dni_number_java.controller;

import projects.f5.dni_number_java.model.DNIModel;
import projects.f5.dni_number_java.view.DNIView;

public class DNIController {
    private final DNIModel model;
    private final DNIView view;

    public DNIController(DNIModel model, DNIView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int dniNumber = -1;

        while (true) {
            dniNumber = view.getDNINumber();
            try {
                char nifLetter = model.calculateNIFLetter(dniNumber);
                view.displayNIF(dniNumber, nifLetter);
                break;
            } catch (IllegalArgumentException e) {
                view.displayError(e.getMessage());
            }
        }
    }
}
