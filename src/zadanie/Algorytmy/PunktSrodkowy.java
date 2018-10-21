package zadanie.Algorytmy;

import java.util.Arrays;
import java.util.Random;

public class PunktSrodkowy {

    public static void main(String[] args) {

        Random r = new Random();
        int[] integers = new int[100];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt();
        }
        System.out.println(Arrays.toString(integers));}


}