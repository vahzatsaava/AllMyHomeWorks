package com.company.converter.converter_for_numbers;

public class Main {
    public static void main(String[] args) {
        Binary binary = null;
        try {
            binary = new Binary("000010");
        } catch (Exception e) {
            System.out.println("Exep Binary");
        }
        try {
            Binary binary1 = Binary.parseBinary(8);
        } catch (Exception e) {
            System.out.println("Exeption Exp");
        }
        try {
            System.out.println(Binary.parseDecimal(new Binary("1000")));
        } catch (Exception e) {
            System.out.println("Exep binary");
        }
        Hexadecimal hexadecimal = null;
        try {
            hexadecimal = new Hexadecimal("AA");
        } catch (Exception e) {
            System.out.println("Exp");
        }
        try {
            System.out.println(Hexadecimal.parseHexadecimals(binary));

        } catch (Exception e) {
            System.out.println("Exp");
        }
        Hexadecimal hexadecimal1 = null;
        try {
            hexadecimal1 = new Hexadecimal("AA");
        }catch (Exception e){
            System.out.println("Exp2");
        }
        //тест
        try {
            System.out.println(Hexadecimal.testValues(hexadecimal, hexadecimal1));
        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null Exeption");
        }



    }
}
