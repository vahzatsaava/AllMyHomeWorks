package com.company.converter.converter_for_numbers;

//пройти валидацию, если валидацию проходим возвравщаем число
// если не проходоми - 0
//Отдельный метод который принимает 10 -чные цифры и выводит 2-чную систему
//ParseInt(); подумать что будет возвращать метод parseBinary

//временная сложность алгоритмов почитать
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

    public static Binary parseBinary(int valueTen) {
        StringBuilder stringBuilder = new StringBuilder();
        while (valueTen > 0) {
            int result = valueTen % 2;
            stringBuilder.insert(0,result);
            valueTen = valueTen / 2;
        }
        /*
        for (int i = valueTen; i > 0; i /= 2) {
            result = valueTen % 2;
            concat += result;
            valueTen = valueTen / 2;
        }

         */
       // String reversed = reverseString(stringBuilder.toString());
        return new Binary(stringBuilder.toString());
    }

    public static int parseDecimal(Binary binary){
        final double binValue = 2;
        String bin = binary.toString();
        double res = 0;
        //преобразовать символ в int
        for (int i = 0; i < bin.length(); i++) {
             double j = bin.length() - i - 1;
             double results =  (Integer.parseInt(bin.charAt(i) + "" ) * Math.pow(binValue, j)) ;
             res += results;

        }
        return (int)res;
    }


    @Override
    public String toString() {
        return binary;
    }

}