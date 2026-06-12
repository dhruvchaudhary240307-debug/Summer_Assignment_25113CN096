import java.util.Scanner;

public class Q47 {

    static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter term number: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Term = " + fibonacci(n));

        sc.close();
    }
}