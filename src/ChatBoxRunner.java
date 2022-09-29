import java.util.Scanner;

public class ChatBoxRunner {
    public static void main(String[] args){

        ChatBot debbie = new ChatBot("Debbie", 12);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scan.nextLine();
        scan.nextLine();
        debbie.greeting(userName);
        debbie.stall();
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nHere are the available questions and options: ");
            System.out.println("1. What's the weather today? ");
            System.out.println("2. Convert feet to meters");
            System.out.println("3. Comparing favorite numbers");
            System.out.println("4. Add three numbers");
            System.out.println("5. Compare two given numbers");
            System.out.println("6. Done");

            System.out.print("\nWhat do you want to do? (Enter the number): ");
            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1){
                debbie.weather();
                debbie.stall();
            }
            if (choice == 2) {
                System.out.print("Enter the amount you want to convert from: ");
                int userFeet = scan.nextInt();
                scan.nextLine();
                System.out.println(userFeet + " feet in meters is: "
                        + debbie.convertFeetToMeters(userFeet));
                debbie.stall();
            }
            if (choice == 3) {
                System.out.print("What is your favorite number?");
                int userNum = scan.nextInt();
                scan.nextLine();
                debbie.favoriteNumber(userNum);
                debbie.stall();
            }
            if (choice == 4) {
                System.out.print("Enter the first number: ");
                int num1 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the second number: ");
                int num2 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the third number: ");
                int num3 = scan.nextInt();
                scan.nextLine();

                System.out.println("The sum of " + num1 + ", " + num2 + ", and "
                        + num3 + " is " + debbie.addNumbers(num1, num2, num3));
                debbie.stall();
            }
            if (choice == 5){
                System.out.print("Enter the first number: ");
                int num1 = scan.nextInt();
                scan.nextLine();
                System.out.print("Enter the second number: ");
                int num2 = scan.nextInt();
                scan.nextLine();
                System.out.println("The first number is greater than the second number: " + debbie.greaternum(num1, num2));
                debbie.stall();
            }
            if (choice == 6) {
                System.out.println(debbie.goodbye());

            }

        }


    }
}
