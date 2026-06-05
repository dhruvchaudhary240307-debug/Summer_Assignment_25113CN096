import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int largestPrimeFactor = 1;

        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                boolean prime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    largestPrimeFactor = i;
                }
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}
