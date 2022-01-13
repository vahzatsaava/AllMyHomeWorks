package com.company.strings.romNetStrings;

public class SoutCutString {
    //Дана строка символов.
    // Выделить подстроку между первой и второй точками и вывести ее на экран монитора.
    public static void cutString(String name, char symbol) {
        String build = "";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != '.') {
                build += name.charAt(i);
            } else {
                count++;
            }
            if (count > 1) {
                break;
            }
        }
        System.out.println(build);
    }

    //переведем в массив
    public static String[] stringToArray(String example) {
        int count = 0;
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == '.') {
                count++;
            }
        }

        String[] resultArray = new String[count];
        String result = "";
        int j = 0;
        for (int i = 0; i < example.length(); i++) {

            if (example.charAt(i) != '.'){
                result += example.charAt(i);
            }
            else {
                resultArray[j] = result;
                result = "";
                j++;
            }

        }

    return resultArray;

}
    public static void main(String[] args) {
        String str = "Мама пошла в кино. Мама купила картину. Егор разбил вазу.";
        cutString(str, '.');
        for (String i:stringToArray(str)
             ) {
            System.out.println(i);
        }    }
}
