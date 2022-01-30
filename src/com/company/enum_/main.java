package com.company.enum_;

public class main {
    class Car{
        String eng;
        String tur;

        public void setEng(String eng) {
            this.eng = eng;
        }

        public void setTur(String tur) {
            this.tur = tur;
        }
    }
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
