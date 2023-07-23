package org.example;

import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final byte monthsInYear = 12;
        final byte percent = 100;

        int principal = 0;
        float annualInterest = 0;
        int period = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter a value between 1K and 1M.");
        }

        while (true) {
            System.out.print("Please enter the annual interest rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Please enter a value between 0.00 and 30.00.");
        }

        while (true) {
            System.out.print("Please enter the length of the loan (in years): ");
            period = scanner.nextInt();
            if (period > 0 && period <= 30)
                break;
            System.out.println("Please enter a value between 0 and 30.");
        }

        int numOfPayments = (period * 12);
        float monthlyInterest = ((annualInterest / percent) / monthsInYear);
        double mortgagePayment = (principal * (monthlyInterest * ((Math.pow(1 + monthlyInterest, numOfPayments) / ((Math.pow(1 + monthlyInterest, numOfPayments) - 1))))));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Your monthly mortgage payment is: " + mortgageFormatted);
    }

}