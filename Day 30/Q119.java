import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.println("\nEmployee Details");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);

        sc.close();
    }
}