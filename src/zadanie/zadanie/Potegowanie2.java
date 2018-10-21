package zadanie.zadanie;

import java.util.Scanner;

public class Potegowanie2 {
    public static void main(String[] args) {

        int liczba;
        int wykladnik;
        long start;
        long stop;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę potęgi: ");
        liczba = scanner.nextInt();
        System.out.println("Podaj wykladnik potęgi: ");
        wykladnik = scanner.nextInt();

        start = System.nanoTime();
        System.out.println("Wynik potegowania zwykłego podanych liczb to: " +PotegowanieZwykle(liczba, wykladnik));
        stop = System.nanoTime();
        System.out.println("Czas wykonania obliczenia zwykłego potęgi: " +(stop - start));

        start = System.nanoTime();
        System.out.println("Wynik potegowania szybkiego podanych liczb to: " +PotegowanieSzybkie(liczba, wykladnik));
        stop = System.nanoTime();
        System.out.println("Czas wykonania obliczenia szybkiego potęgi: " +(stop - start));

    }

    public static int PotegowanieZwykle (int liczba, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        }
        else {
            return liczba * PotegowanieZwykle(liczba, wykladnik - 1);
        }
    }

    public static int PotegowanieSzybkie(int liczba, int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        }
        if (wykladnik % 2 == 0) {
            return PotegowanieSzybkie(liczba, wykladnik/2)* PotegowanieSzybkie(liczba, wykladnik/2);
        }
        else {
            return (liczba * (PotegowanieSzybkie(liczba, (wykladnik - 1)/2) * PotegowanieSzybkie(liczba, (wykladnik - 1)/2)));
        }
    }


}
