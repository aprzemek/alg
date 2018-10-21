package zadanie.Algorytmy;

import java.util.Arrays;
import java.util.Random;

public class Eq2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = rand.nextInt(10) + 1;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("wygenerowana tablica, na ktorej poszukamy punktu equilibrium");
        System.out.println(Arrays.toString(array));
        int equilibrium = 0;
        for (int i = 1; i < arraySize; i++) {
            int sumaLewa = 0, sumaPrawa = 0;
            for (int j = 0; j < arraySize; j++) {
                if (j < i) {
                    sumaLewa += array[j];
                } else {
                    sumaPrawa += array[j];
                }
            }
            if (sumaLewa == sumaPrawa) {
                equilibrium = i;
                break;
            }
        }
        if (equilibrium == 0) {
            System.out.println("Brak equilibrium dla danej tablicy");
        } else {
            System.out.println("Equilibrium dla danej tablicy to " + equilibrium);
        }
    }
}
