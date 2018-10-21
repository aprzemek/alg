package zadanie.Algorytmy;

import java.util.Scanner;

public class Palidorm2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String slowo = scanner.nextLine();
        System.out.println(czyPalindrom(slowo));
    }

    private static boolean czyPalindrom(String slowo) {
        String[] znaki = usunZnaki(slowo).split("");
        for (int i = 0; i < znaki.length / 2; ++i) {
            if (!znaki[i].equalsIgnoreCase((znaki[znaki.length - 1 - i]))) {
                return false;
            }
        }
        return true;
    }

    private static String usunZnaki(String slowo) {
        StringBuilder sb = new StringBuilder();
        sb.append(slowo);
        for (int i = 0; i < sb.length(); ++i) {
            if (!Character.isAlphabetic(sb.charAt(i))) {
                sb.delete(i, i + 1);
                --i;
            }
        }
        return sb.toString();
    }
}
