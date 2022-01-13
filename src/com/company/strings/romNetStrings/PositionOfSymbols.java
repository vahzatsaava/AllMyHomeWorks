package com.company.strings.romNetStrings;

public class PositionOfSymbols {
    //     * выясните, под каким номером встроке стоит первая буква я
    public static int positionSymbol(String name) {
        int position = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'я'){
                position = i;
                break;
            }
        }

        return position;
    }
    public static int lastPositionOfSymbols(String name){
        int position = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'я'){
                position = i;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        String str = "НепонятнаяСтрокая";
        int num = str.indexOf("я");
        System.out.println(num);
        int modulPos = positionSymbol(str);
        System.out.println(modulPos);
        System.out.println("LastIndex");
        int lastIndex = lastPositionOfSymbols(str);
        System.out.println(lastIndex);
    }
}
