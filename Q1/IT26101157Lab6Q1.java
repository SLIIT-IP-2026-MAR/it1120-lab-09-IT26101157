import java.util.Scanner;

public class IT26101157Lab6Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Check if 'a' is zero to avoid division by zero
        if (a == 0) {
            System.out.println("Value of 'a' cannot be zero in a quadratic equation.");
        } else {
            // Calculate the discriminant: b^2 - 4ac
            double discriminant = Math.pow(b, 2) - (4 * a * c);

            // Check if roots are real or imaginary
            if (discriminant < 0) {
                System.out.println("The equation has complex/imaginary roots.");
            } else {
                // Calculate the two values of x using Math.sqrt()
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                // Display the results
                System.out.println("The values of x are:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        input.close();
    }
}