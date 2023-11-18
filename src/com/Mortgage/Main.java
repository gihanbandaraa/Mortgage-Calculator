package com.Mortgage;


public class Main {

    public static void main(String[] args) {

        //Read the Value For method
        double principal = Console.readNum("Enter Principal: " ,10_000 ,1_000_000 );
        double annualRate = Console.readNum("Enter the Annual Interest Rate:",1,30);
        int Years = (int) Console.readNum("Enter the Time Period(Years): ",1,30);

       Calculation calculation =new Calculation(principal,annualRate,Years);

       new MortgageReport(calculation).printMortgage();
       new MortgageReport(calculation).printPaymentSchedule();
    }

}
