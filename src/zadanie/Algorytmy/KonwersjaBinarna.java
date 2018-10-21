package zadanie.Algorytmy;
import java.util.Scanner;

public class KonwersjaBinarna {
    public static void main(String[] args) {

        System.out.println("podaj liczbe do konwersji");
        Scanner scanner = new Scanner(System.in);
            String binarna = Integer.toBinaryString(scanner.nextInt());
            System.out.println("Liczba binarna tej liczby to : " + binarna);
    }
}
