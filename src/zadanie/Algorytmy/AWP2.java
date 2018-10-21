package zadanie.Algorytmy;

import java.util.Arrays;
import java.util.Random;

public class AWP2 {

    public static final int N =1000;

    public static void main(String[] args) {
        long poczatek =System.currentTimeMillis();
        int minimalna=N, maksymalna=0;

        for (int i = 0; i < N; i++) {
            int [] tabela = generowanieTablicy(N);
            int liczba = losowanieLiczby(N);
            int pomocnicza = przeszukiwanie(tabela, liczba);

            if (pomocnicza>maksymalna){
                maksymalna = pomocnicza;
            }

            if (pomocnicza<minimalna){
                minimalna= pomocnicza;
            }
        }
        long koniec = System.currentTimeMillis();
        System.out.println(minimalna);
        System.out.println("średnio: " + (minimalna+maksymalna/2));
        System.out.println(maksymalna);
        System.out.println("czas wykonania: " + (koniec-poczatek) + " milisekund");
        System.out.println();
    }

    private static int [] generowanieTablicy (int wielkosc){
        int [] tabela = new int[wielkosc];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = i+1;
        }
        return tabela;
    }


    private static int losowanieLiczby (int wielkosc){
        Random rand = new Random();
        return rand.nextInt(wielkosc)+1;
    }

    private static int przeszukiwanie(int [] tabela, int poszukiwana){
        int licznik=0;

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i]==poszukiwana){
                break;
            }
            licznik++;
        }
        return licznik;
    }

    private static int przeszukiwanieBinarne(int [] tabela, int poszukiwana){
        int licznik = 0, pomocnicza;
        boolean czyZnalezione = false;
        do {
            licznik++;
            pomocnicza = tabela.length/2;
            if (tabela[pomocnicza] == poszukiwana){
                czyZnalezione=true;
            }else if (tabela[pomocnicza]<poszukiwana){
                tabela = Arrays.copyOfRange(tabela, pomocnicza, tabela.length);
            }else if (tabela[pomocnicza]>poszukiwana){
                tabela = Arrays.copyOfRange(tabela, 0, pomocnicza);
            }
        }while (!czyZnalezione);
        return licznik;
    }
}


