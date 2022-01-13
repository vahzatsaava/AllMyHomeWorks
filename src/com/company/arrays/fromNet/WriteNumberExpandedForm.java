package com.company.arrays.fromNet;

public class WriteNumberExpandedForm {
    //Kata.expandedForm(12); # Should return "10 + 2"
    //Kata.expandedForm(42); # Should return "40 + 2"
    //Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

    //перевести из из 10 - чной системы в 10 - чную
    //как из 2-чной в 10 чную
    // final не переопределяется в наследниках
    // используется когда нам надо сохранить и оставить без изменения метод
    public static String expandedForm(int num) { //1230
        final int dexValue = 10;
        //переводим инт в стринг
        String ret = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < ret.length(); i++) {
            //j переменная это степень числа dexValue
            double j = ret.length() - i -1;
            //создаем чаровую переменную
            char ch = ret.charAt(i);
            int res = Character.getNumericValue(ch);
            double results = res * Math.pow(dexValue,j);
            int doParse = (int)results;
            //если i у нас не равен предпоследнему элементу , то мы прибавляем плюс
            if (i != ret.length() - 1) {
                stringBuilder.append(doParse + " + ");
            }
            else {
                stringBuilder.append(doParse);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(43202));
    }
}
