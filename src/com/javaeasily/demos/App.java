package com.javaeasily.demos;

public class App {
    public static void main(String[] args) {
        String title = "loan calculator";
        System.out.println(title.toUpperCase());
        System.out.println();

        int amount = 100;
        int years = 5;
        double interestRate = 10;

        if (amount > 0 && years > 0 && interestRate > 0 ) {
            System.out.println("Calculating loan based on:");
            System.out.println("Initial Amount:  " + "$" + amount);
            System.out.println("Number of years: " + years);
            System.out.println("Interest Rate:   " + interestRate + "%");

            double interestRateMultiplier = 1 + interestRate / 100;

            double currentAmountPayable = amount;
            int currentYear= 1;
            while (currentYear <= years) {
                currentAmountPayable =  currentAmountPayable * interestRateMultiplier;
                currentYear++;
            }

            String totalAmountDue = Double.toString(currentAmountPayable);
            int indexOfDecimalPoint = totalAmountDue.indexOf(".");
            String totalAmountDueFormatted = totalAmountDue.substring(0, indexOfDecimalPoint + 3);
            System.out.println("Total Amount Due: " + totalAmountDueFormatted);

        } else {
            System.out.println("Invalid values -  can not calculate repayment amount.");
        }
    }
}
