package com.company.strings.romNetStrings;

public class StringLastContains {
    public static boolean solution(String str, String ending) {
/*
 public static boolean solution(String str, String ending) {
    char[] strung = str.toCharArray(), out = ending.toCharArray();
    if (out.length>strung.length) return false;
    for (int i=0; i<(out.length); i++)
      if (strung[(strung.length-1)-i]!=out[(out.length-1)-i])
        return false;
    return true;
 */

        return str.endsWith(ending);
    }

    public static String disemvowel(String str) {
        String res = "";
        for (char i : str.toCharArray()
        ) {
            if (i >= 'A' && i % 2 == 0) {
                return res += i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String res = "abcd";
        String res3 = "cd";
        System.out.println(solution(res, res3));
        String sdf = "AAABBBsdfsdf";
        System.out.println(disemvowel(sdf));
    }
}
