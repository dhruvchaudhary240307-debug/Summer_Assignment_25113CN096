import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double salary;

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        System.out.println("\n----- Employee Details -----");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);

        sc.close();
    }
}
