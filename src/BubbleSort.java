/**
 * Class BubbleSort in role service to process algorithm and display.
 * 
 * Version 16/9/2026
 * @author VinhHQHE194318
 */
public class BubbleSort {
    
    // Mảng toàn cục lưu trữ dữ liệu
    private static int[] arrayOfElements;

    /**
     * Cho phép người dùng nhập giá trị cho mảng dựa vào size được truyền vào.
     */
    public static void inputElements(int size) {
        arrayOfElements = new int[size];
        for (int i = 0; i < arrayOfElements.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            arrayOfElements[i] = Unitity.checkInputInt();
        }
    }

    /**
     * Sắp xếp mảng theo thứ tự tăng dần.
     */
    public static void sortArrayAscending() {
        if (arrayOfElements == null || arrayOfElements.length == 0) {
            System.err.println("List empty.");
            return;
        }
    
        for (int i = 0; i < arrayOfElements.length - 1; i++) {
            for (int j = 0; j < arrayOfElements.length - 1 - i; j++) {
                if (arrayOfElements[j] > arrayOfElements[j + 1]) {
                    int temp = arrayOfElements[j];
                    arrayOfElements[j] = arrayOfElements[j + 1];
                    arrayOfElements[j + 1] = temp;
                }
            }
        }
       
    }

    /**
     * Sắp xếp mảng theo thứ tự giảm dần.
     */
    public static void sortArrayDescending() {
        if (arrayOfElements == null || arrayOfElements.length == 0) {
            System.err.println("List empty.");
            return;
        }
        for (int i = 0; i < arrayOfElements.length - 1; i++) {
            for (int j = 0; j < arrayOfElements.length - 1 - i; j++) {
                if (arrayOfElements[j] < arrayOfElements[j + 1]) {
                    int temp = arrayOfElements[j];
                    arrayOfElements[j] = arrayOfElements[j + 1];
                    arrayOfElements[j + 1] = temp;
                }
            }
        }
       
    }
    
    public static void displaySortArrayAscending(){
         if (arrayOfElements == null || arrayOfElements.length == 0) {
            System.err.println("List empty.");
            return;
        }
         System.out.println("----- Ascending -----");
        for (int i = 0; i < arrayOfElements.length; i++) {
            System.out.print("[" + arrayOfElements[i] + "]");
            if (i < arrayOfElements.length - 1) {
                System.out.print("->");
            }
        }
        System.out.println();
     
    }
    
    public static void displaySortArrayDescending(){
         if (arrayOfElements == null || arrayOfElements.length == 0) {
            System.err.println("List empty.");
            return;
        }
        System.out.println("----- Descending -----");
        for (int i = 0; i < arrayOfElements.length; i++) {
            System.out.print("[" + arrayOfElements[i] + "]");
            if (i < arrayOfElements.length - 1) {
                System.out.print("<-");
            }
        }
         System.out.println();
    }
}