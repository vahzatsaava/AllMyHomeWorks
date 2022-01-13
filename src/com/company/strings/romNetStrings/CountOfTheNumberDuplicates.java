package com.company.strings.romNetStrings;

import java.util.HashMap;
import java.util.Map;

public class CountOfTheNumberDuplicates {
    //Напишите функцию, которая будет возвращать количество отдельных
    // нечувствительных к регистру буквенных символов и числовых цифр, которые встречаются во входной строке более одного раза. Предполагается,
    // что входная строка содержит только буквы
    // (как в верхнем, так и в нижнем регистре) и числовые цифры.
    public static int duplicateCount(String text) {
        /*
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (text.toLowerCase().charAt(i) == text.toLowerCase().charAt(j)){
                    count ++;
                    break;
                }
            }
        }

         */ // попытка номер 1


        return 0;
    }

    public static void main(String[] args) {
        int a = duplicateCount("Aea1e22e");
        System.out.println(a);
    }
}
