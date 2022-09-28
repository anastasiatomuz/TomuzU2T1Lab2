import java.util.Scanner;

public class ChatBoxRunner {
    public static void main(String[] args){
        ChatBot debbie = new ChatBot("Debbie", 12);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scan.nextLine();
        scan.nextLine();

        debbie.greeting(userName);
        System.out.println("Here are the available questions and options: ");
        System.out.println("1. What's the weather today? ");
        System.out.println("2.  Convert feet to meters");
        System.out.println("3. What's your favorite number?");
        System.out.println("4. Add three numbers");
        System.out.println("5. Done");

        System.out.print("\nWhat do you want to do? (Enter the number): ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1){
            debbie.greeting(userName);
        }
        if (choice == 2){
            debbie.weather();
        }
        if (choice == 3){
            System.out.print("Enter the amount you want to convert from: ");
            int userFeet = scan.nextInt();
            scan.nextLine();
            debbie.convertFeetToMeters(userFeet);
        }
        if (choice == 4){
            System.out.print("Enter the first number: ");
            int num1 = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the second number: ");
            int num2 = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the third number: ");
            int num3 = scan.nextInt();
            scan.nextLine();

            debbie.addNumbers(num1, num2, num3);
        }
        if (choice == 5){
            debbie.goodbye();
        }


    }
}
