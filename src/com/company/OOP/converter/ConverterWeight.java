package com.company.OOP.converter;


public class ConverterWeight {
        /*
        Необходимо написать программу конвертер физических
        величин.
                Масса:
        кг<->грамм<->фунт(lb)<->карат в любую сторону
        Длина (расстояние):
        метр<->миля<->ярд<->фут в любую сторону

        Пользователю сначала предлагается выбрать что
        переводить (масса или расстояние), затем предлагается
        выбрать единицу измерения. Далее пользователь должен ввести
        число. В результате программа должна вывести 4 строки с
        переведенными величинами.
        Пример:

                > Выберите что переводить:
                > [1] - масса
                >  [2] - расстояние
    > 2
            > Выберите единицу измерения:
                > [1] - метр
                > [2] - миля
                 > [3] - ярд
                 > [4] - фут
    > 1
            > Введите число:
                > 10
                > Результат:
                > метры: 10
                > мили: 0.006214
                > ярды: 10.94
                > футы: 32.81

         */    //условие задачи

    private final double meter; //1 миля это 1600 метров
    private final double fut;   // 1 метр 3.2 фута
    private final double yard;  //1 метр 1.09 ярдов
    private final double mills;

    public ConverterWeight(int meter) {
        this.meter = meter;
        this.fut = meter * 3.2;
        this.yard = meter * 1.09;
        this.mills = meter * 1600;
    }

    public ConverterWeight(double fut) {
        this.fut = fut;
        this.meter =  fut * 0.3;
        this.mills = fut * 0.000189;
        this.yard = fut * 0.33;
    }

    public ConverterWeight(float yard) {
        this.yard = yard;
        this.meter = yard * 0.91;
        this.fut = yard * 3;
        this.mills = yard * 0.0056;
    }

    public ConverterWeight(long mills) {
        this.mills = mills;
        this.meter = mills * 1600;
        this.fut = mills * 5280;
        this.yard = mills * 1760;
    }


    @Override
    public String toString() {
        return "Метры: " + meter + "\n" + "Футы: " + fut + "\n" + "Мили: " + mills + "\n" + "Ярды: " + yard;

    }
}
