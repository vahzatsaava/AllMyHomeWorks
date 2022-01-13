package com.company.strings.romNetStrings;

import java.util.ArrayList;
import java.util.List;

public class SmileCount {
    // Учитывая массив (arr) в качестве аргумента,
    // завершите функцию countSmileys, которая должна вернуть общее количество улыбающихся лиц.
    //Примеры действительных смайлов: :): D ;-D: ~)
    //Недействительные смайлы:; (:>:}:]
    public static int countSmiles(List<String> arr) {
        int count = 0;
        for (int i = 0; i <arr.size(); i++) {
            if (arr.get(i).contains(":)") || arr.get(i).contains(";)") || arr.get(i).contains(":-)") || arr.get(i).contains(":~)")
                    || arr.get(i).contains(";-)") || arr.get(i).contains(";~)") || arr.get(i).contains(":D") || arr.get(i).contains(";D") ||
                    arr.get(i).contains(":-D ") || arr.get(i).contains(":~D") || arr.contains(";-D") || arr.get(i).contains(";~D")
             ){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":)");
        a.add(":)");
        a.add(":D");
        a.add("hey");
        a.add(":)");
        a.add("hello");
        a.add("32sdf");
        a.add(")'");
        for (String s:a
             ) {
            System.out.println(s);

        }
        System.out.println(countSmiles(a));

    }
}
