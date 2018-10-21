package zadanie.Algorytmy;

import java.util.Arrays;
import java.util.Random;

public class Equalibrium {
    public static void main(String[] args) {
        Random random = new Random();
        int rozmiar = random.nextInt(100);
        int[] tablica = new int[rozmiar];
        for (int i = 0; i < tablica.length; ++i) {
            tablica[i] = random.nextInt(10) + 0;
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println(wyznaczEquilbrium(tablica));
    }

    private static int wyznaczEquilbrium(int[] tablica) {
        int sumaLewa = tablica[0];
        int sumaPrawa = 0;
        for (int i = 1; i < tablica.length; ++i) {
            sumaPrawa += tablica[i];
        }

        for (int i = 1; i < tablica.length; ++i) {
            if (sumaLewa == sumaPrawa) {
                return i;
            } else {
                sumaLewa += tablica[i];
                sumaPrawa -= tablica[i];
            }
        }
        return -1;
    }
}
