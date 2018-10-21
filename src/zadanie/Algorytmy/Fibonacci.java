package zadanie.Algorytmy;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int liczba;
        int wykladnik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        liczba = scanner.nextInt();

        System.out.println("Wartość " +liczba +" liczby ciągu Fibonacciego wynosi: " +liczbaFibonacciego(liczba));
    }

    public static int liczbaFibonacciego (int liczba) {
        if (liczba == 0) {
            return 0;
        }
        if (liczba == 1) {
            return 1;
        }
        return liczbaFibonacciego(liczba -1) + liczbaFibonacciego(liczba - 2);
    }
}