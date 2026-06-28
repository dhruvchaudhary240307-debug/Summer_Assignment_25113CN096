import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        while (true) {

            System.out.println("\n1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    balance += sc.nextDouble();
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double amount = sc.nextDouble();

                    if (amount <= balance)
                        balance -= amount;
                    else
                        System.out.println("Insufficient Balance");

                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}