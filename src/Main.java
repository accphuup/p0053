public class Main {

    // Display program menu
    public static void menu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        System.out.print("Please choice one option: ");
    }

    public static void main(String[] args) {
        // Initialize array variable to hold user data
        int[] array = null;

        // Loop program menu until exit
        while (true) {
            // Display main menu options
            menu();
            // Read valid menu choice (1 to 4)
            int choice = Unitity.checkInputLimit();

            switch (choice) {
                case 1:
                    // Display header for input section
                    System.out.println("----- Input Element -----");
                    System.out.println("Input Length Of Array");
                    // Read valid size of array
                    int size = Unitity.inputSizeOfArray("Enter Number: ");
                    // Instantiate array with given size
                    array = new int[size];
                    // Read each element value from user
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Enter Number " + (i + 1) + ": ");
                        array[i] = Unitity.checkInputInt();
                    }
                    break;

                case 2:
                    // Check if array has data before sorting
                    if (array == null || array.length == 0) {
                        System.out.println("Please input elements first.");
                    } else {
                        // Sort array ascending and print result
                        BubbleSort.sortAscending(array);
                        BubbleSort.displayAscending(array);
                    }
                    break;

                case 3:
                    // Check if array has data before sorting
                    if (array == null || array.length == 0) {
                        System.out.println("Please input elements first.");
                    } else {
                        // Sort array descending and print result
                        BubbleSort.sortDescending(array);
                        BubbleSort.displayDescending(array);
                    }
                    break;

                case 4:
                    // Exit application
                    return;
            }
        }
    }
}