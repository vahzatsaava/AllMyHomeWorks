package com.company.enum_;

public class main {

    public static void main(String[] args) {
        if (getDay() == DaysOfWeek.MONDAY){
            System.out.println("Понедельник");
        }
        if (getDay() == DaysOfWeek.HURRAY){

        }



    }

    private static DaysOfWeek getDay(){

        int a = 5;

        if (a == 5){
            return DaysOfWeek.MONDAY;
        }
        else{
            return DaysOfWeek.HURRAY;
        }
    }
}
