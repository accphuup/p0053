public class BubbleSort {

    // Sort array in ascending order
    public static void sortAscending(int[] array) {
        // Outer loop: passes through array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop: compares adjacent pairs
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Swap if left element is greater than right element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Sort array in descending order
    public static void sortDescending(int[] array) {
        // Outer loop: passes through array elements
        for (int i = 0; i < array.length - 1; i++) {
            // Inner loop: compares adjacent pairs
            for (int j = 0; j < array.length - 1 - i; j++) {
                // Swap if left element is smaller than right element
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Display array in ascending format: [1]->[3]->[5]
    public static void displayAscending(int[] array) {
        System.out.println("----- Ascending -----");
        // Print each element inside brackets
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
            // Print right arrow between elements, except the last one
            if (i < array.length - 1) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    // Display array in descending format: [5]<-[3]<-[1]
    public static void displayDescending(int[] array) {
        System.out.println("----- Descending -----");
        // Print each element inside brackets
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
            // Print left arrow between elements, except the last one
            if (i < array.length - 1) {
                System.out.print("<-");
            }
        }
        System.out.println();
    }
}