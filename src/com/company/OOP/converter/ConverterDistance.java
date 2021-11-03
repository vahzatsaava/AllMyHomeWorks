package com.company.OOP.converter;

public class ConverterDistance {
    private final double kg;
    private final double tonnes;
    private final double gramms;
    private final double funts;

    public ConverterDistance(int kg) {
        this.kg = kg;
        this.gramms = kg * 1000;
        this.funts = kg * 2.2;
        this.tonnes = kg * 0.001;
    }

    public ConverterDistance(double gramms) {
        this.gramms = gramms;
        this.kg = gramms * 0.01;
        this.funts = gramms * 0.002;
        this.tonnes = gramms * 0.0003;
    }

    public ConverterDistance(float funts) {
        this.funts = funts;
        this.kg = funts * 0.45;
        this.gramms = funts * 453;
        this.tonnes = funts * 0.0004;
    }

    public ConverterDistance(long tonnes) {
        this.tonnes = tonnes;
        this.kg = tonnes * 1000;
        this.gramms = tonnes * 100000;
        this.funts = tonnes * 2204;
    }


    @Override
    public String toString(){
        return "Киллограммы: " + kg + "\n" + "Граммы: " + gramms + "\n" + "Фунты: " + funts + "\n" + "Тонны: " + tonnes;
    }

}
