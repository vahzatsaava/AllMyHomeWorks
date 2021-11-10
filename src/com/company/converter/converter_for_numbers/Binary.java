package com.company.converter.converter_for_numbers;

//пройти валидацию, если валидацию проходим возвравщаем число
// если не проходоми - 0
//Отдельный метод который принимает 10 -чные цифры и выводит 2-чную систему
//ParseInt(); подумать что будет возвращать метод parseBinary
public class Binary {

    private String binary = "";

    public Binary(String binary) {
        if (validate(binary)) {
            this.binary = binary;
        } else {
            this.binary = "1";
        }
    }

    //метод проверяет ввели ли мы 2-значное число где 0-ли и 1-цы
    public static boolean validate(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) != '1' && binary.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    public static void parseBinary(int valueTen) {
        int result = 0;
        String concat = "";
        for (int i = valueTen; i > 0; i /= 2) {
            result = valueTen % 2;
            concat += result;
            valueTen = valueTen / 2;
        }
        System.out.println(reverseString(concat));
    }

    private static String reverseString(String name) {
        String build = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            build += name.charAt(i);
        }
        return build;
    }

    @Override
    public String toString() {
        return binary;
    }

}