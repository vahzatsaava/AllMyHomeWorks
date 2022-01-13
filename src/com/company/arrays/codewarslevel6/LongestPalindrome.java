package com.company.arrays.codewarslevel6;

public class LongestPalindrome {
    public static int longestPalindrome(final String s) {
        String reversString = "";
        String palindromeS = "";
        int max = 0;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            reversString += s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == reversString.charAt(i)) {
                count++;
            }

        }
        max = count;
        System.out.println(reversString);
        System.out.println(s);

        return max;
    }

    public static void main(String[] args) {
        int a = longestPalindrome("baablkj12345432133d");
        System.out.println(a);
    }
}
