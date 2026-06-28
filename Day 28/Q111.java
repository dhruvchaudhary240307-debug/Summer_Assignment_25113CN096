import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int available = 100;

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        if (tickets <= available) {

            available -= tickets;

            System.out.println("Booking Successful");
            System.out.println("Name : " + name);
            System.out.println("Tickets : " + tickets);
            System.out.println("Remaining : " + available);

        } else {

            System.out.println("Tickets Not Available");
        }

        sc.close();
    }
}