
import java.util.Scanner;

public class Unitity {

    // Scanner instance to read input from keyboard
    private static final Scanner sc = new Scanner(System.in);

    // Read a valid integer from keyboard
    public static int checkInputInt() {
        while (true) {
            try {
                // Read input string and trim extra spaces
                String input = sc.nextLine().trim();

                // Parse string to integer and return
                int number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
                // Display error message when input is not an integer
                System.out.println("Please input number and number is greater than zero");
                System.out.print("Re-enter integer: ");
            }
        }
    }

    // Read size of array (must be > 0)
    public static int inputSizeOfArray(String msg) {
        while (true) {
            try {
                // Display prompt message
                System.out.print(msg);
                // Read input string and trim extra spaces
                String input = sc.nextLine().trim();
                // Parse string to integer
                int size = Integer.parseInt(input);

                // Verify size is strictly greater than 0
                if (size > 0) {
                    return size;
                } else {
                    // Display error if size <= 0
                    System.out.println("Please input number and number is greater than zero");
                }
            } catch (NumberFormatException e) {
                // Display error if input is not a number
                System.out.println("Please input number and number is greater than zero");
            }
        }
    }

    // Read valid menu option choice (1 to 4)
    public static int checkInputLimit() {
        while (true) {
            try {
                // Read input string and trim extra spaces
                String input = sc.nextLine().trim();
                // Parse string to integer
                int choice = Integer.parseInt(input);

                // Verify choice is within range [1, 4]
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    // Display error if option is out of range
                    System.out.println("Please choice option from 1 to 4.");
                }
            } catch (NumberFormatException e) {
                // Display error if input is not a number
                System.out.println("Please input integer number.");
            }
            System.out.print("Please choice one option: ");
        }
    }
}
