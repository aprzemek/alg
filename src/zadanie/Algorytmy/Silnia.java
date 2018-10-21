package zadanie.Algorytmy;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wynik = scanner.nextInt();

        System.out.println(wynik);
    }

    public static long silnia(long n) {
        if (n == 0) { return 1; }
        return silnia(n - 1) * n;
    }
}


