import java.text.NumberFormat;
import java.util.Scanner;

public class mortgage_calculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("principle:");
        int principal = scanner.nextInt();

        System.out.print("Annual interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (years): ");
        byte years = scanner.nextByte();
        int numbers_of_payments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (MONTHS_IN_YEAR * Math.pow(1 + monthlyInterest, numbers_of_payments))
                / (Math.pow(1 + monthlyInterest, numbers_of_payments) -1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().toString();
        System.out.print("Mortgage:" + mortgageFormatted);





    }
}
