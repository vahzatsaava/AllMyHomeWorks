package com.company.dz_from_udemy.complex;

public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3.4, 4.2);
        ComplexNumber complexNumber1 = new ComplexNumber(4.0, 4.0);
        ComplexNumber complexNumber2 = ComplexNumber.addition(complexNumber,complexNumber1);
        ComplexNumber complexNumber3 = ComplexNumber.subtraction(complexNumber,complexNumber1);
        System.out.println(complexNumber3);

    }


}
