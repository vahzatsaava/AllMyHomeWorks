package com.company.arrays.fromNet;

public class BuyingAcar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int months = 0;
        int result = 0;

        for (int i = 0; i < 100; i++) {
            //условие если денег в наличии больше чем цена, то мы выходим из цикла сразу
            if (startPriceOld >= startPriceNew ){
                months = 0;
                result = startPriceOld - startPriceNew;
                break;
            }
            //каждый второй элемент то прибавляем 0.5
            if (i % 2 == 1) {
                percentLossByMonth += 0.5;
            }
            startPriceOld = (int) (startPriceOld - (startPriceOld * percentLossByMonth / 100));
            startPriceNew = (int) (startPriceNew - (startPriceNew * percentLossByMonth / 100));
            result = (startPriceOld - startPriceNew) + (savingperMonth * (i + 1));
            months++;
            if (result > 0) {
                break;
            }

        }

        return new int[]{months, result};
    }

    public static void main(String[] args) {
        int[] res = nbMonths(8000, 8000, 1000, 1.5);
        for (int i : res
        ) {
            System.out.println(i);

        }

    }
}
