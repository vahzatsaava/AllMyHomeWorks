package com.company.strings.romNetStrings;

public class HalfOfString {
    // Условие задачи: ввести 2 слова, состоящие из четного числа букв.
    // Получить слово состоящее из первой половины первого слова и второй половины второго слова.
    public static void halsOfStrings(String firstHalf,String lastHalf){
        String buildFirst = "";
        String buildLast = "";
        for (int i = 0; i < firstHalf.length() / 2; i++) {
            buildFirst += firstHalf.charAt(i);
        }
        for (int i = lastHalf.length() / 2; i < lastHalf.length() ; i++) {
            buildLast += lastHalf.charAt(i);
        }
        System.out.println(buildFirst + buildLast);
    }
    public static void main(String[] args) {
        String firstStr = "Разговор";
        String secondStr = "Беседа";
        halsOfStrings(firstStr,secondStr);
    }
}
