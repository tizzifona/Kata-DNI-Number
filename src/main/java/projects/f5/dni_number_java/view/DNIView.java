package projects.f5.dni_number_java.view;

import java.util.Scanner;

public class DNIView {
    private final Scanner scanner = new Scanner(System.in);

    public int getDNINumber() {
        System.out.print("\nEnter your DNI number (0-99999999): ");
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            return getDNINumber();
        }
    }

    public void displayNIF(int dniNumber, char nifLetter) {
        System.out.println("-----------------------------------");
        System.out.println("Your NIF is: " + dniNumber + "-" + nifLetter + "\n");
    }

    public void displayError(String message) {
        System.out.println("Error: " + message);
    }
}
