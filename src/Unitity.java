import java.util.Scanner;

/**
 * Class Unitity in role validate to check valid input users.
 * 
 * Version 16/9/2026
 * 
 * @author VinhHQHE194318
 */
public class Unitity {

    private static final Scanner sc = new Scanner(System.in);

    
    public static int checkInputInt() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                int result = Integer.parseInt(input);
                return result;
            } catch (NumberFormatException e) {
              System.err.println("Please input numberand number is greater than zero");
            }
        }
    }
    /**
     * Allow user input number of array (length > 0)
     */
    public static int inputSizeOfArray(String msg) {

        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine().trim();
                int result = Integer.parseInt(input);
                if (result > 0) {
                 return result;
                }              
            } catch (NumberFormatException e) {
              System.err.println("Please input numberand number is greater than zero");
            }
        }
    }

    /**
     * Check menu choice limit from min to max
     */
    public static int checkInputLimit() {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                int number = Integer.parseInt(input);
                if (number >= 1 && number <= 4) {
                     return number;
                }else{
                    System.err.println("Must be input integer " + 1 + " to " + 4 + ".");
                }
                
            } catch (NumberFormatException e) {
              System.err.println("Please input numberand number is greater than zero");
            }
        }
    }
}