package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class Whatisbetween {
    public static int[] between(int a, int b) {
        /*
        int[] arr = new int[(b - a) + 1];
        int counter = 0;
        for (int i = a; i <= b ; i++) {
            arr[counter] = i;
            counter++;
        }

        return arr;

         */  //первое решение
        //второе
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            list.add(i);
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
    public static String howMuchILoveYou(int nb_petals) {
        String res = "I love you,a little,a lot,passionately,madly,not at all";
        String[] arraus = res.split(",");
        return arraus[nb_petals - 1];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1,4)));
        System.out.println(howMuchILoveYou(2));
    }
}
