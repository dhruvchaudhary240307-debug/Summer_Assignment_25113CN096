import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        System.out.println("Array after moving zeroes:");

        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}