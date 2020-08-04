package com.codewithdelayne;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principal = 0;
        float annualInterest = 0;
        byte years = 0;

       principal = (int) readNumber("Principal: ", 1000, 1_000_000);
       annualInterest = (float) readNumber("Annual Interest Rate: ", 1, 30);
       years = (byte) readNumber("Period(Years): ", 1, 30 );


        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);


    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte percent = 100;

        float monthlyInterestRate = annualInterestRate / percent / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        double mortgage = principal *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return mortgage;
    }


}
// 1ST EXERCISE: CREATE MORTGAGE CALCULATOR BASED ON PRIMITIVE VALUES
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
//
//
//
// Exercise 2: ERROR HANDLING
//
// PRINCIPAL (1K - 1M)
//  IF not ASK FOR VALID VALUES
//
//  AIR = 0< Number >=30
//  if not error msg for correct values
//
// CLEAN CODE
//
// methods should only have about 20 lines of code
//
// Match the pieces that go together, for example numberOfPayments
//
// Look for repetitive patters, for example while loops
//
//  EXTRACTING METHODS
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//