import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers are:");

        for (int n = start; n <= end; n++) {

            if (n < 2)
                continue;

            boolean prime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}
