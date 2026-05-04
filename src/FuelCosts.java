import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        double gallonsInTank = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;
        double costToDrive100Miles = 0.0;
        double distanceOnFullTank = 0.0;
        String trash = "";
        boolean done = false;

        // Get gallons in tank
        do {
            System.out.print("Enter gallons of gas in the tank: ");

            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine();

                if (gallonsInTank > 0) {
                    done = true;
                } else {
                    System.out.println("Gallons must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        // Get fuel efficiency
        done = false;
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");

            if (in.hasNextDouble()) {
                milesPerGallon = in.nextDouble();
                in.nextLine();

                if (milesPerGallon > 0) {
                    done = true;
                } else {
                    System.out.println("Miles per gallon must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        // Get gas price
        done = false;
        do {
            System.out.print("Enter price of gas per gallon: ");

            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();

                if (pricePerGallon > 0) {
                    done = true;
                } else {
                    System.out.println("Gas price must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        // Calculate results
        costToDrive100Miles = (100.0 / milesPerGallon) * pricePerGallon;
        distanceOnFullTank = gallonsInTank * milesPerGallon;

        // Output results
        System.out.println("Cost to drive 100 miles: $" + costToDrive100Miles);
        System.out.println("Distance on a full tank: " + distanceOnFullTank + " miles.");
    }
}
