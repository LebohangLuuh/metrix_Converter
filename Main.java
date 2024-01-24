import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose the conversion:");
        System.out.println("a. Feet to Meters");
        System.out.println("b. Pounds to Kilograms");
        System.out.println("c. Fahrenheit to Celsius");
        System.out.print("Enter the letter corresponding to your choice: ");
        char choice = scanner.next().charAt(0);


        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        // Perform the conversion based on the user's choice
        double result = 0.0;
        switch (choice) {
            case 'a':
                result = feetToMeters(quantity);
                System.out.println(quantity + " feet is equal to " + result + " meters.");
                break;
            case 'b':
                result = poundsToKilograms(quantity);
                System.out.println(quantity + " pounds is equal to " + result + " kilograms.");
                break;
            case 'c':
                result = fahrenheitToCelsius(quantity);
                System.out.println(quantity + " Fahrenheit is equal to " + result + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice. Please choose a, b, or c.");
        }
        scanner.close();
    }

    // Conversion methods
    private static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    private static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
