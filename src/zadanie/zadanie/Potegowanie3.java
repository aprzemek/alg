package zadanie.zadanie;

public class Potegowanie3 {
    public static final int N = 10;

    public static void main(String[] args) {

        long start, end, potega;

        System.out.println("Potęgowanie szybkie iteracyjnie: ");
        start = System.nanoTime();
        potega = potegowanieSzybkieIteracyjnie(2,N);
        end = System.nanoTime();
        System.out.println("Wynik: " + potega + "\nCzas: " + (end-start));

        System.out.println("\nPotęgowanie zwykłe iteracyjnie: ");
        start = System.nanoTime();
        potega = potegowanieZwykleIteracyjnie(2,N);
        end = System.nanoTime();
        System.out.println("Wynik: " + potega + "\nCzas: " + (end-start));

        System.out.println("\nPotęgowanie szybkie rekurencyjnie: ");
        start = System.nanoTime();
        potega = potegowanieSzybkie(2,N);
        end = System.nanoTime();
        System.out.println("Wynik: " + potega + "\nCzas: " + (end-start));

        System.out.println("\nPotęgowanie zwykłe rekurencyjnie: ");
        start = System.nanoTime();
        potega = potegowanieZwykle(2,N);
        end = System.nanoTime();
        System.out.println("Wynik: " + potega + "\nCzas: " + (end-start));


    }

    public static long potegowanieSzybkie(long a, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return potegowanieSzybkie(a, n/2)*potegowanieSzybkie(a, n/2);
        }
        return potegowanieSzybkie(a, n/2)*potegowanieSzybkie(a, n/2)*a;
    }

    public static long potegowanieZwykle(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        else if ((pow < 0)) {
            return 1/ potegowanieZwykle(base, -pow);
        }
        return potegowanieZwykle(base, pow-1)*base;
    }

    public static long potegowanieZwykleIteracyjnie(int a, int n) {
        int potega = 1;
        int wykladnik = 0;
        while (wykladnik < n) {
            potega *= a;
            wykladnik++;
        }
        return potega;
    }

    public static long potegowanieSzybkieIteracyjnie(int a, int n) {
        int potega = 1;
        int wykladnik = 0;
        while (wykladnik < n/2) {
            potega *= a;
            wykladnik++;
        }
        if (n % 2 == 0) {
            return potega*potega;
        }
        return potega*potega*a;
    }
}

