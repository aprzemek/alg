package zadanie.Algorytmy;

import java.util.Scanner;

public class euk2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę");
        int pierwszy = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int drugi = scanner.nextInt();
        System.out.println("wspólny dzielnik to: " +nwd(pierwszy,drugi));
    }
        private static int nwd(int pierwszy, int drugi) {
            if (pierwszy % drugi == 0) {
                return drugi;
            }
            return nwd(drugi, pierwszy % drugi);
        }
    }


