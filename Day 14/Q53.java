import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int pos = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                pos = i;
                break;
            }
        }

        if(pos != -1)
            System.out.println("Found at index " + pos);
        else
            System.out.println("Not Found");

        sc.close();
    }
}