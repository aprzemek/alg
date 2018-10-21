package zadanie.Algorytmy;

import java.util.Scanner;

public class Rek3 {
    public static void main(String[] args) {

        int liczba;
        int wykladnik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        liczba = scanner.nextInt();
        System.out.println("Podaj wykladnik: ");
        wykladnik = scanner.nextInt();

        System.out.println(Potegowanie(liczba,wykladnik));

    }

    public static int Potegowanie (int liczba,int wykladnik) {
        if (wykladnik == 0) {
            return 1;
        } else {
            return liczba * Potegowanie(liczba, wykladnik - 1);
        }
    }
}
