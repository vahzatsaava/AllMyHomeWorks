package com.company.strings.romNetStrings;

public class ReplaceNull {
    //Напишите Java-программу для удаления всех пробелов из строки с помощью replace()
    public static void replaceNull(String name) {
        System.out.println(name.replace(" ", ""));
    }

    //Напишите Java-программу для удаления всех пробелов из строки без использования replace().
    public static void replaceWithoutReplace(String name) {
        String result = "";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ') {
                result += name.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String name = "a b c d ";
        replaceNull(name);
        replaceWithoutReplace(name);
    }
}
