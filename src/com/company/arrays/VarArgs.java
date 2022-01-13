package com.company.arrays;

public class VarArgs {
    public static String add(String... names) {

        final int length = names.length;
        // решение со Switch
        switch (length){
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this",names[0]);
            case 2:
                return String.format("%s and %s like this",names[0],names[1]);
            case 3:
                return String.format("%s, %s and %s like this",names[0],names[1],names[2]);
            default:
                return String.format("%s, %s and %d others like this",names[0],names[1],names.length-2);

        }
        // c if
        /*
        if (length == 0) {
            return "no one likes this";
        } else if (length == 1) {
            return names[0] + " like this";
        } else if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others" + " like this";
        }

         */


    }

    public static void main(String[] args) {
        String[] names = {"Peter", "Jakob", " df", "dsfs"};
        String[] names1 = {"Frenki"};
        String build = add(names);
        System.out.println(build);


    }
}
