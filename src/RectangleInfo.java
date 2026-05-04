import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;

        // Get width
        do {
            System.out.print("Enter the width of the rectangle: ");

            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();

                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Width must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        // Get height
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");

            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();

                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Height must be greater than 0.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        } while (!done);

        // Calculate area, perimeter, and diagonal
        area = width * height;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((width * width) + (height * height));

        // Output results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
