package com.company.converter.converter_for_numbers;

public class Main {
    public static void main(String[] args) {
        Binary binary = new Binary("000010");
        System.out.println(binary);
        Binary binary1 = Binary.parseBinary(20);
        System.out.println(binary1);
    }
}
