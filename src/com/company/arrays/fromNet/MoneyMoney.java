package com.company.arrays.fromNet;

public class MoneyMoney {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int ears = 0;
        /*
        for (int i = 0; i < ears + 1; i++) {
            ears++;
            double procent = principal * interest;
            double taxValue  = procent * tax;
            principal = principal + procent - taxValue;

            if (principal >= desired){
                break;
            }
        }

         */
        while (principal < desired) {
            double procent = principal * interest;
            double taxValue = procent * tax;
            principal += procent - taxValue;
            ears++;
        }
        return ears;
    }


    public static void main(String[] args) {
        int result = calculateYears(1000, 0.01625, 0.18, 1200);

        System.out.println(result);
    }
}
