package projects.f5.dni_number_java;

import projects.f5.dni_number_java.controller.DNIController;
import projects.f5.dni_number_java.model.DNIModel;
import projects.f5.dni_number_java.view.DNIView;

public class App {
    public static void main(String[] args) {
        DNIModel model = new DNIModel();
        DNIView view = new DNIView();
        DNIController controller = new DNIController(model, view);
        controller.run();
    }
}
