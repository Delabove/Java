package com.codewithdelayne;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
//        1. declare constants -make code self explanatory
        final byte MONTHS_IN_YEAR = 12;
        final byte percent = 100;

        Scanner scan = new Scanner(System.in);

//        2. Principal
        System.out.println("Principal: ");
        int principalLoanAmount = scan.nextInt();

//       3. Annual Interest rate -percent, divide by 100, divide by 12

        System.out.println("Annual Interest Rate: ");
        float annualInterestRate = scan.nextFloat();
        float monthlyInterestRate = annualInterestRate/percent/MONTHS_IN_YEAR;
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate);


//        4. Period
        System.out.println("Period(Years): ");
        byte lengthOfLoanInYears = scan.nextByte();
        int numberOfPayments = lengthOfLoanInYears * MONTHS_IN_YEAR;



//        5. Mortgage Calculation

        double monthlyMortgagePayment = principalLoanAmount *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
        /(Math.pow(1 + monthlyInterestRate, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgagePayment);
        System.out.println("Mortgage: " + mortgageFormatted);


    }
}
//
//Principal: amount of loan (P)
//Annual Interest Rate: (divide by 12 bc equation asks for r monthly interest rate)
//                      Annual interest rate is represented as a perc. to calc
//                      multiply by 100. So.. Users input *100/12 for MIR
//Period (Years): mult by 12 months to calc # payments
//to raise to the power: Math.pow();
//Mortgage:

//Calculate monthly payment and display as a currency;
//Mortgage Calculation Equation:
//                    r(1+r)^n
//        M = P        ________
//                    (1+r)^n - 1