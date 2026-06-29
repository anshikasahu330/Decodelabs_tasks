import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. USD to INR");
        System.out.println("4. EUR to INR");
        System.out.println("5. INR to GBP");
        System.out.println("6. GBP to INR");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double convertedAmount = 0;
        String result = "";

        switch (choice) {
            case 1:
                convertedAmount = amount / 83.0;
                result = amount + " INR = " + convertedAmount + " USD";
                break;

            case 2:
                convertedAmount = amount / 90.0;
                result = amount + " INR = " + convertedAmount + " EUR";
                break;

            case 3:
                convertedAmount = amount * 83.0;
                result = amount + " USD = " + convertedAmount + " INR";
                break;

            case 4:
                convertedAmount = amount * 90.0;
                result = amount + " EUR = " + convertedAmount + " INR";
                break;

            case 5:
                convertedAmount = amount / 105.0;
                result = amount + " INR = " + convertedAmount + " GBP";
                break;

            case 6:
                convertedAmount = amount * 105.0;
                result = amount + " GBP = " + convertedAmount + " INR";
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.printf("Converted Amount: %.2f\n", convertedAmount);
        System.out.println(result);

        sc.close();
    }
}