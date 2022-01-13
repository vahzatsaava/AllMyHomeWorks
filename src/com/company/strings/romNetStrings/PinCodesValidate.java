package com.company.strings.romNetStrings;

public class PinCodesValidate {
    public static boolean validatePin(String pin) {
        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;

    }
    //переписать метод еще раз самостоятельно
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("123544"));
       String[] arrayString = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        System.out.println(longestConsec(arrayString,2));

    }
}
