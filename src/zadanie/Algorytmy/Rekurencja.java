package zadanie.Algorytmy;

import java.util.Scanner;

public class Rekurencja {

    public static int potega(int podstawa, int wykladnik) {

        if (wykladnik == 0)
            return 1;
        return podstawa * potega(podstawa, --wykladnik);
    }

    public static void main(String[] args) {
        int p, w;

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj podstawe: ");
        p = sc.nextInt();
        System.out.print("Podaj wykladnik: ");
        w = sc.nextInt();

        System.out.println(p + "^" + w + " = " + potega(p,w));
    }
}
