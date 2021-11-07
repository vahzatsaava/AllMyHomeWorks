package com.company.strings;

import java.util.Arrays;

public class StringToArray {
    //    Дана строка, состоящая из слов. Слова разделены пробелами. Преобразовать строку в массив слов.
    private static String[] stringToArrray(String example) {
        int count = 0;
        // example.split(example);
        //   нарисовать блок схему
        // 1) извлечь каждое слово из строки
        // 2) передать извлеченные слова в масси(записать)
        // 3) _.._вернуть этот массив
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == ' ') {
                count++;
            }
        }
        String[] stringArray = new String[count + 1];
        String result = "";
        int j = 0;
        for (int i = 0; i < example.length(); i++) {
             if (example.charAt(i) != ' ')
             {
                    result = result + example.charAt(i) ;

              }
             else{
                 stringArray[j] = result;
                 result = "";
                 j++;
             }
          //  System.out.println(stringArray[i]=result);

        }
        stringArray[stringArray.length-1] = result;

        return stringArray;

    }

    public static void main(String[] args) {
        String nameString = "Hello Dear Friends";
        for (String i:stringToArrray(nameString)) {
            System.out.println(i);
        }


    }
}
