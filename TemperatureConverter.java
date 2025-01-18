import java.util.Scanner;

public class TemperatureConverter {

    //  convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    //  convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        
        double inputTemperature;
        double convertedTemperature;

        // Perform conversion
        if (choice == 1) {
            // Celsius to Fahrenheit
            System.out.print("Enter the temperature in Celsius: ");
            inputTemperature = scanner.nextDouble();
            convertedTemperature = celsiusToFahrenheit(inputTemperature);
            System.out.println(inputTemperature + " Celsius is " + convertedTemperature + " Fahrenheit.");
        } else if (choice == 2) {
            // Fahrenheit to Celsius
            System.out.print("Enter the temperature in Fahrenheit: ");
            inputTemperature = scanner.nextDouble();
            convertedTemperature = fahrenheitToCelsius(inputTemperature);
            System.out.println(inputTemperature + " Fahrenheit is " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        
        scanner.close();
    }
}
