package org.example;

import java.text.NumberFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        final int monthsInYear = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the principle: ");
        int principle = scanner.nextInt();

        System.out.print("Please enter the annual interest rate: ");
        float annualInterest = scanner.nextFloat();

        System.out.print("Please enter the length of the loan (in years): ");
        int period = scanner.nextInt();

        int numOfPayments = (period * 12);
        float monthlyInterest = ((annualInterest / percent) / monthsInYear);
        double mortgagePayment = (principle * (monthlyInterest * ((Math.pow(1 + monthlyInterest, numOfPayments) / ((Math.pow(1 + monthlyInterest, numOfPayments) - 1))))));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Your monthly mortgage payment is: " + mortgageFormatted);
    }

}