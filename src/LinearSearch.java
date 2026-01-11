import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,12,324,534};

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter number to search in array: ");
        int num = s.nextInt();
        boolean found = false;

        for (int a : arr) {
            if (a == num) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in an array");
        } else {
            System.out.println("Element not found.");
        }
    }
}
