import java.util.Scanner;

public class Q120 {

    static void addStudent(String[] names, int[] marks, int n) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static void displayStudent(String[] names, int[] marks, int n) {

        System.out.println("\nStudent Records");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
        }
    }

    static void averageMarks(int[] marks, int n) {

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += marks[i];

        System.out.println("Average Marks = " + (sum / (double) n));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] marks = new int[5];

        int choice;

        do {

            System.out.println("\n===== Student Management =====");
            System.out.println("1. Add Students");
            System.out.println("2. Display Students");
            System.out.println("3. Average Marks");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(names, marks, 5);
                    break;

                case 2:
                    displayStudent(names, marks, 5);
                    break;

                case 3:
                    averageMarks(marks, 5);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}