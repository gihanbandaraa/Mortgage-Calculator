package com.Mortgage;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageReport {

    private   Calculation calculation;

    public MortgageReport(Calculation calculation) {
        this.calculation = calculation;
    }

    public void printPaymentSchedule() {

        System.out.println("----------\n");
        System.out.println("DUE PAYMENT"+"\n");
        calculation.calculateBalance();
        System.out.println("You complete the loan amount");
    }

    public void printMortgage() {

        double finalMonthlyPayment = calculation.calculateMortgage();
        System.out.println("\n----------");
        System.out.println("MORTGAGE");
        NumberFormat monthlyPayment = NumberFormat.getCurrencyInstance(new Locale("en", "lk"));
        System.out.println("\n" + "Monthly Payment : " +   monthlyPayment.format(finalMonthlyPayment));
    }
}
