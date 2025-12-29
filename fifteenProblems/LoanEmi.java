package fifteenProblems;

import java.util.Scanner;

/*
12. Loan EMI Breakdown

Take a loan amount and interest rate.
Simulate 12 months using loops to calculate:

EMI amount

Principal paid each month

Interest paid each month

Remaining balance
------------------------------------------

 */
public class LoanEmi {

    static double calculateEMI(double loan, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = 12;
        return (loan * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    static void showBreakdown(double loan, double rate, double emi) {
        double monthlyRate = rate / (12 * 100);
        double balance = loan;

        System.out.println("\n--- Breakdown ---");

        for (int i = 1; i <= 12; i++) {
            double interest = balance * monthlyRate;
            double principal = emi - interest;
            balance = balance - principal;

            System.out.println("\nMonth " + i);
            System.out.println("Principal: " + principal);
            System.out.println("Interest: " + interest);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loan = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();

        double emi = calculateEMI(loan, rate);
        System.out.println("\nMonthly EMI: " + emi);

        showBreakdown(loan, rate, emi);

        sc.close();
    }
}
