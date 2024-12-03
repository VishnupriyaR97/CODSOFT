import java.util.Scanner;

public class CurrencyConverter {

    // Conversion rates (for demonstration, rates can be modified or fetched dynamically)
    private static final double USD_TO_EUR = 0.94; // 1 USD = 0.94 EUR
    private static final double USD_TO_INR = 82.74; // 1 USD = 82.74 INR
    private static final double EUR_TO_USD = 1.06; // 1 EUR = 1.06 USD
    private static final double EUR_TO_INR = 88.06; // 1 EUR = 88.06 INR
    private static final double INR_TO_USD = 0.012; // 1 INR = 0.012 USD
    private static final double INR_TO_EUR = 0.011; // 1 INR = 0.011 EUR

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display currency options
        System.out.println("Currency Converter");
        System.out.println("Choose the source currency:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.print("Enter your choice (1-3): ");
        int sourceCurrency = scanner.nextInt();

        // Display target currency options
        System.out.println("\nChoose the target currency:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.print("Enter your choice (1-3): ");
        int targetCurrency = scanner.nextInt();

        // Ask user for the amount to convert
        System.out.print("\nEnter amount to convert: ");
        double amount = scanner.nextDouble();

        // Perform conversion based on source and target currency
        double convertedAmount = convertCurrency(sourceCurrency, targetCurrency, amount);

        // Display the result
        if (convertedAmount != -1) {
            System.out.printf("\nConverted Amount: %.2f\n", convertedAmount);
        } else {
            System.out.println("Invalid currency choice.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform the currency conversion
    private static double convertCurrency(int sourceCurrency, int targetCurrency, double amount) {
        double convertedAmount = -1;

        // Check if the source and target currencies are valid
        if (amount < 0) {
            System.out.println("Amount must be positive.");
            return -1;
        }

        // Convert based on the currency choice
        if (sourceCurrency == 1 && targetCurrency == 2) {
            convertedAmount = amount * USD_TO_EUR; // USD to EUR
        } else if (sourceCurrency == 1 && targetCurrency == 3) {
            convertedAmount = amount * USD_TO_INR; // USD to INR
        } else if (sourceCurrency == 2 && targetCurrency == 1) {
            convertedAmount = amount * EUR_TO_USD; // EUR to USD
        } else if (sourceCurrency == 2 && targetCurrency == 3) {
            convertedAmount = amount * EUR_TO_INR; // EUR to INR
        } else if (sourceCurrency == 3 && targetCurrency == 1) {
            convertedAmount = amount * INR_TO_USD; // INR to USD
        } else if (sourceCurrency == 3 && targetCurrency == 2) {
            convertedAmount = amount * INR_TO_EUR; // INR to EUR
        } else if (sourceCurrency == targetCurrency) {
            // No conversion needed if source and target are the same
            convertedAmount = amount;
        }

        return convertedAmount;
    }
}
