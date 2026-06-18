
import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element Found");
                return;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");

        sc.close();
    }
}