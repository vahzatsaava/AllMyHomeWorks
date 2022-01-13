package com.company.arrays.fromNet;

public class PersiteceBugger {
    //Напишите функцию persistence, которая принимает положительный параметр num и
    // возвращает его мультипликативную постоянство,
    // то есть количество раз, которое вы должны умножить цифры в num, пока
    // не дойдете до единственной цифры.
    public static int persistence(long n) {
        int result = 0;
        while (n > 9) {
            long multi = 1;
            for (char t : String.valueOf(n).toCharArray()
            ) {
                multi *= Long.parseLong(String.valueOf(t));

            }
            n = multi;
            result++;
        }
        return result;
    }

        public static void main (String[]args){
            System.out.println(persistence(369));
        }

        // задача дано число 45
        // 4 * 5 = 20
        // 2* 0  = 0
        //итого 2
    }
