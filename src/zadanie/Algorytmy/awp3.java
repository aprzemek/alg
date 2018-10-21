package zadanie.Algorytmy;

import java.util.Random;
import java.util.Scanner;

public class awp3 {

    static final int N = 1000;

    public static void main(String[] args) {

        long poczatek = System.currentTimeMillis();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] wyniki = new int[N];

        int[] tablica = new int[N];
        for (int i = 0; i < tablica.length; ++i) {
            tablica[i] = i+1;
        }


        for (int i = 0; i < N; i++) {

            int losowa = random.nextInt(N) + 1;
            boolean zgadl = false;
            int licznik = 0;

            while (zgadl == false) {

                for (int j = 0; j < tablica.length; j++) {
                    if (tablica[j] == losowa) {
                        zgadl = true;
                        licznik++;
                        wyniki[i] = licznik;
                        break;
                    } else
                        licznik++;
                }
            }
        }

        long koniec = System.currentTimeMillis();

        System.out.println("Wartość maksymalna przeszukania tablicy to: " +wartoscMaksymalna(wyniki));
        System.out.println("Wartość minimalna przeszukania tablicy to: " +wartoscMinimalna(wyniki));
        System.out.println("Wartość srednia przeszukania tablicy to: " +wartoscSrednia(wyniki));
        System.out.println("Czas wykonania logiki operacji wynosi: " +(koniec - poczatek) +" milisekund. ");
        //System.out.println(Arrays.toString(wyniki));

    }
    public static int wartoscMaksymalna (int[] tablica) {
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }

    public static int wartoscMinimalna (int[] tablica) {
        int min = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    public static double wartoscSrednia (int[] tablica) {
        int suma = 0;
        for (int i=0; i < tablica.length; i++) {
            suma = suma + tablica[i];
        }
        double srednia = suma / tablica.length;;
        return srednia;
    }



}

