
import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("Q1. Capital of India?");
        System.out.println("1. Delhi");
        System.out.println("2. Mumbai");
        System.out.println("3. Chennai");
        System.out.print("Answer: ");
        int ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println("\nQ2. 5 + 7 = ?");
        System.out.println("1. 10");
        System.out.println("2. 12");
        System.out.println("3. 15");
        System.out.print("Answer: ");
        ans = sc.nextInt();

        if (ans == 2)
            score++;

        System.out.println("\nQ3. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Browser");
        System.out.println("3. Operating System");
        System.out.print("Answer: ");
        ans = sc.nextInt();

        if (ans == 1)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        sc.close();
    }
}