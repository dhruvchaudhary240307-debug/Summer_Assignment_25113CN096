import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 25;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess < secret)
                System.out.println("Too Low");
            else if (guess > secret)
                System.out.println("Too High");
            else
                System.out.println("Correct Guess!");

        } while (guess != secret);

        sc.close();
    }
}