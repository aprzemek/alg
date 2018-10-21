package zadanie.Algorytmy;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

            String original, reverse = "";
            Scanner in = new Scanner(System.in);

            System.out.println("Podaj slowo by sprawdzić czy jest palidromem");

            original = in.nextLine();

            int length = original.length();

            for (int i = length - 1; i >= 0; i--)
                reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("Jest palinfromem.");
            else
                System.out.println("nie jest palidromem.");

    }
}