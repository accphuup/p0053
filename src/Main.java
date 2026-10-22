/**
 * Class Main in role controller to run program.
 * 
 * Version 16/9/2026
 * @author VinhHQHE194318
 */
public class Main {

    public static void menu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        System.out.print("Please choice one option: ");
      
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int choice = Unitity.checkInputLimit();
            switch (choice) {
                case 1:
                    System.out.println("----- Input Element -----");
                       System.out.println("Input Length Of Array");
                    int size = Unitity.inputSizeOfArray("Enter Number: ");
                    BubbleSort.inputElements(size);        // Truyền size thẳng vào class BubbleSort
                    break;
                case 2:
                    BubbleSort.sortArrayAscending();
                    BubbleSort.displaySortArrayAscending();
                    break;
                case 3:
                    BubbleSort.sortArrayDescending();
                    BubbleSort.displaySortArrayDescending();
                    break;
                case 4:
                    return;
            }
        }
    }
}