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
//
// PRINCIPAL (1K - 1M)
//  IF not ASK FOR VALID VALUES
//
//  AIR = 0< Number >=30
//  if not error msg for correct values

//        2. Principal
        int principalLoanAmount=0;

       while (true) {
           System.out.println("Principal: ");
           principalLoanAmount = scan.nextInt();
           if (principalLoanAmount >= 1000 && principalLoanAmount <= 1_000_000)
               break;
           System.out.println("Enter a value between 1,000 and 1,000,000");


       }




//       3. Annual Interest rate -percent, divide by 100, divide by 12

        float monthlyInterestRate = 0;
        while(true) {
            System.out.println("Annual Interest Rate: ");
             float annualInterestRate = scan.nextFloat();

            if (annualInterestRate>= 1 && annualInterestRate <= 30) {
                 monthlyInterestRate = annualInterestRate / percent / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");

        }



//        4. Period

        int numberOfPayments = 0;
        while (true) {
            System.out.println("Period(Years): ");
            byte lengthOfLoanInYears = scan.nextByte();

            if(lengthOfLoanInYears >= 1 && lengthOfLoanInYears <=30){
                numberOfPayments = lengthOfLoanInYears * MONTHS_IN_YEAR;
                break;
            }
        }

//        5. Mortgage Calculation

        double monthlyMortgagePayment = principalLoanAmount *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
        /(Math.pow(1 + monthlyInterestRate, numberOfPayments) -1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyMortgagePayment);
        System.out.println("Mortgage: " + mortgageFormatted);


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
//
//
//
//
//
//
//
//
//