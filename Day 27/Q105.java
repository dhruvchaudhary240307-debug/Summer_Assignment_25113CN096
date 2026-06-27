
import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll;
        String name;
        double marks;

        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();

        System.out.println("\n----- Student Record -----");
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);

        sc.close();
    }
}