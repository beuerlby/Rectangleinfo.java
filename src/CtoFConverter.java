import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        double celsius = 0.0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean done = false;

        // Get valid Celsius temperature input
        do {
            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid numeric temperature.");
            }
        } while (!done);

        // Convert Celsius to Fahrenheit
        fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Output result
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}
