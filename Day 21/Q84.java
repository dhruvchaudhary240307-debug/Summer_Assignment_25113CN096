import java.util.Scanner;

public class Q84 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}