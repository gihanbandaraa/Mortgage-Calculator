package com.Mortgage;

import java.text.NumberFormat;
import java.util.Locale;

public class Calculation {

    private static final int  MONTH_IN_YEAR = 12;
    private static final int PERCENT = 100;

    private double principal;
    private double annualRate;
    private int years;

    public Calculation(double principal, double annualRate, int years) {
        this.principal = principal;
        this.annualRate = annualRate;
        this.years = years;
    }

    public double calculateMortgage() {

        double monthlyRate = getMonthlyRate();
        int numberOfPayments = getNumberOfPayments();

        double Mortgage = principal*(monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments))/((Math.pow((1 + monthlyRate), numberOfPayments)) - 1);
        return Mortgage;
    }
    public String calculateBalance() {

        double monthlyRate = getMonthlyRate();
        int numberOfPayments = getNumberOfPayments();

        for (int i = 0; i <= getNumberOfPayments(); i++) {
            double duePayment = principal * ((Math.pow(1 + monthlyRate, numberOfPayments) - (Math.pow(1 + monthlyRate, i))) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1));
            NumberFormat monthlyPayment =NumberFormat.getCurrencyInstance(new Locale("en","lk"));
            System.out.println(monthlyPayment.format(duePayment));
        }
     return toString();
    }

    private int getNumberOfPayments() {
        return years * MONTH_IN_YEAR;
    }

    private double getMonthlyRate() {
        return annualRate / MONTH_IN_YEAR / PERCENT;
    }
}
