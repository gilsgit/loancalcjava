package com.javaeasily.demos;

public class App {
    public static void main(String[] args) {
        double amount = 100;
        int years = 5;
        double interestRate = 10.0;

        double interestRateMultiplier = 1 + interestRate / 100;

        double year1AmountDue = amount * interestRateMultiplier;
        double year2AmountDue = year1AmountDue * interestRateMultiplier;
        double year3AmountDue = year2AmountDue * interestRateMultiplier;
        double year4AmountDue = year3AmountDue * interestRateMultiplier;
        double year5AmountDue = year4AmountDue * interestRateMultiplier;


        System.out.println("Loan Calculator\nTotal Amount Due in 5 Years is:");
        System.out.println(year5AmountDue);


    }
}
