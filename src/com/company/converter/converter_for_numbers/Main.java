package com.company.converter.converter_for_numbers;

public class Main {
    public static void main(String[] args)  {
        Binary binary = new Binary("000010");
        System.out.println(binary);
        Binary binary1 = Binary.parseBinary(8);
        System.out.println(binary1);
        System.out.println( Binary.parseDecimal(new Binary("1000")));
        try {
        Hexadecimal hexadecimal = new Hexadecimal("VV");

        }
        catch (Exception e){
            System.out.println("Exp");
        }
        try {
         System.out.println(Hexadecimal.parseHexadecimals(binary));

        }
        catch (Exception e){
            System.out.println("Exp");
        }





    }
}
