import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sentence: ");
        String str = sc.nextLine();

        String words[] = str.trim().split("\\s+");

        System.out.println("Total Words = " + words.length);

        sc.close();
    }
}