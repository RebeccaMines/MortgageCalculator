package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principle: ");
        int principle = scanner.nextInt();
        System.out.print("Please enter the annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        System.out.print("Please enter the length of the loan (in years): ");
        int period = scanner.nextInt();

        float monthlyInterest = ((annualInterest / 100) / 12);
        int numTotalPayments = (period * 12);
        double mortgagePayment = (principle * (monthlyInterest * ((Math.pow(1 + monthlyInterest, numTotalPayments) / ((Math.pow(1 + monthlyInterest, numTotalPayments) - 1))))));

        System.out.println((mortgagePayment));
    }

}