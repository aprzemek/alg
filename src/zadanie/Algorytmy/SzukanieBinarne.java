package zadanie.Algorytmy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SzukanieBinarne {

    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static final int N = 1000000;
    static ArrayList<Long> czasy = new ArrayList<>();
    static ArrayList<Integer> powtorzeniaArr = new ArrayList<>();
    static int tablica[] = new int[N];
    static int wyszukiwana;

    public static void main(String[] args) {


        for (int i = 0; i < N; i++) {
            tablica[i] = i;
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            algorytmDzielIZwyciezaj();
        }
        long endTime = System.nanoTime();
        long wynikczasu = (endTime - startTime);
        System.out.println("wynik czasu to " + wynikczasu);
    }

    public static void algorytmDzielIZwyciezaj() {
        wyszukiwana = rand.nextInt(N);
        int pierwszyindeks = 0;
        int ostatniindeks = N - 1;
        int srodek;
        int powtorzenia = 0;

        while (pierwszyindeks <= ostatniindeks) {
            srodek = (pierwszyindeks + ostatniindeks) / 2;
            if (tablica[srodek] == wyszukiwana) {


                System.out.println("Odnaleziono liczbe " + wyszukiwana + " pod indeksem " + srodek + " a ilosc powtorzen to " + powtorzenia);

                return;
            }
            if (tablica[srodek] < wyszukiwana) {
                pierwszyindeks = srodek + 1;
                powtorzenia += 1;
            } else {
                ostatniindeks = srodek - 1;
                powtorzenia += 1;
            }

        }


        System.out.println("nie znaleziono tej liczby");
    }
}
