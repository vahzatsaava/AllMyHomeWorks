package com.company.experimets;

import com.company.converter.converter_for_numbers.Binary;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class main {
    public static int changeValue(int number) {
        return number + 1;
                            //ДЗ
        //вспомнить как преобразовать из 10 -чной системы в 2-ичную и наоборот
        //Почитать методы Integer,String(Изучить и посмотреть)
                    //задача
        //Дано число 18 - десятичное ,надо перевести его в двоичную ситсему
                    //решение
        /*
        18 / 2 = 9 : остаток = 0          20 / 2 = 10     0
        9  / 2 = 4   остаток = 1          10 / 2 = 5      0
        4  / 2 = 2   остаток = 0           5 / 2 = 2      1
        2  / 2  = 1  остаток = 0           2 / 2 = 1      0
        1  / 2  = 0   остаток = 1          1 / 2 = 0      1
        число 10010                          10100

        из 2-чной в - 10 ричную

        11001
        1*2^4 + 1*2^3 + 0*2^2 + 0*2^1 + 1*2^0
        result = 25;- десятичное число


         переводим в 16 -чную сис-му;
         30 - число                             40 число                    50 число                    число 65                  число 85
         30 / 16 = 1 остаток - 14         40 / 16 = 2 остаток - 8        50 / 16 = 3 остаток - 2       65 / 16 = 4 остаток 1     85 / 16 = 5 остаток 5
         1 / 16   = 0  остаток - 1           2 / 16 = 0 остаток -2         3 / 16 = 0 остаток -3         4 / 16 = 0  остаток 4      5/ 16 = 0  остаток 5
         */
    }


    public static void main(String[] args) {
        try {
        Connection connection = DriverManager.getConnection(null);
        }catch (SQLException e){
            System.out.println("SQLExp");
        }
        Binary binary = null;
       try {
           int value = 5 / 0;
           binary.toString();
       }
       catch (ArithmeticException arithmeticException){
           System.out.println("Деление на 0");
       }
       catch (NullPointerException nullPointerException){
           System.out.println("NPE");
       }
       finally {
           System.out.println(" Finally");
       }

            /*
        String numbers = "12345";
        Integer number = 200;
        Double number2 = 200.0;
        Integer a = Integer.valueOf(numbers);
        System.out.println(a +1);
        System.out.println();
        System.out.println(Integer.max(12,22)); //max
        System.out.println(Integer.hashCode(10));
        System.out.println(Integer.reverse(3));//???
        /*
        возвращает значение, полученное
        путем изменения порядка битов в двоичном
        представлении с двумя дополнениями указанного значения int
         */
        /*
        System.out.println(Integer.bitCount(104435345));
        System.out.println(Integer.compare(1,4)); //сравнивает значения чисел и возвращает boolean
        System.out.println(Integer.compareUnsigned(4,4)); //сравнение без знака -
        System.out.println(Integer.decode(numbers));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        //строки
        System.out.println();
        int numberes = 123;
        boolean real = false;
        char[] symbols = new char[]{'$','0','$','w','-'};
        char nums = '$';
        System.out.println(String.valueOf(numberes));
        System.out.println(String.valueOf(real));
        System.out.println(String.copyValueOf(symbols)); //возвращает в строку массив чаров
        System.out.println(String.valueOf(symbols,1,2)); // возвращает строку массива чаров с начальной длиной offset и конечной count
        System.out.println(String.format("%d " + "%d" ,numberes,number));//форматирование строки
        System.out.println(String.join(numbers,"123456"));

        //от -127 до 128
        // кэшиируется байт (для экономии памяти)
        //int a = Integer.MAX_VALUE;
/*
        System.out.println(Integer.parseInt("0011", 2));
        Integer.valueOf(number); // возвращает Integer
        System.out.println(number.equals(number2));

 */


    }
}
