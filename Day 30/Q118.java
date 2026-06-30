import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++", "DSA"};

        System.out.println("Available Books:");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("Enter Book Number to Issue: ");
        int choice = sc.nextInt();

        if (choice >= 1 && choice <= books.length)
            System.out.println("Book Issued: " + books[choice - 1]);
        else
            System.out.println("Invalid Choice");

        sc.close();
    }
}
