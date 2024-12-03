import java.util.Scanner;

public class AtmInterface {

    // User's ATM pin and balance
    private static final int PIN = 1234;
    private static double balance = 1000.00; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their PIN
        System.out.print("Enter your PIN: ");
        int enteredPin = scanner.nextInt();

        // Validate the PIN
        if (enteredPin != PIN) {
            System.out.println("Invalid PIN! Exiting...");
            return;
        }

        // Display the ATM menu
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();

            // Perform the action based on the user's choice
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to check the balance
    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    // Method to deposit money
    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("You have successfully deposited $" + depositAmount);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw money
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("You have successfully withdrawn $" + withdrawAmount);
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }
}
