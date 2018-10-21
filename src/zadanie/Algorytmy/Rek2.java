package zadanie.Algorytmy;

public class Rek2 {

    public static void main(String[] args) {
        System.out.println(potegowanie(2, 8));
        System.out.println(silnia(6));
    }

    private static int potegowanie(int liczba, int wykladnik) {
        if(wykladnik==0){
            return 1;
        }else {
            return liczba * potegowanie(liczba, wykladnik-1);
        }
    }

    private static int silnia(int liczba){
        if (liczba==0){
            return 1;
        }else {
            return liczba * silnia(liczba-1);
        }
    }
}

