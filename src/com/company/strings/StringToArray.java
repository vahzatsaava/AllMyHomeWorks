package com.company.strings;

import java.util.Arrays;

public class StringToArray {
    //    Дана строка, состоящая из слов. Слова разделены пробелами. Преобразовать строку в массив слов.
    private static void stringToArrray(String example) {
        int count = 0;
        example.split(example);
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

        for (int i = 0; i < count + 1; i++) {
             if (example.charAt(i) != ' ')
             {
                    result = result + example.charAt(i) ;
              }
          //  System.out.println(stringArray[i]=result);
            stringArray[i]=result;
        }
        for (String i:stringArray) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        String nameString = "Hello Dear Friends";
        stringToArrray(nameString);

    }
}
