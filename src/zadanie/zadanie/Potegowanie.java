package zadanie.zadanie;

public class Potegowanie {

    public static void main(String[] args) {
        // int podstawaPotegi = 0;
        // int wykladnikPotegi = 0;
        int wynik;
        int liczbaDoSilni;

        System.out.println(potegowanie(3, 4));
        //System.out.println(silnia(5));
    }

    private static long potegowanie(int podstawaPotegi, int wykladnikPotegi) {


        long wynik=0;
        if (wykladnikPotegi == 0) {
            return 1;

        }

        if (wykladnikPotegi%2== 0) {

            return wynik=potegowanie(podstawaPotegi, ((wykladnikPotegi)/2))*potegowanie(podstawaPotegi,wykladnikPotegi/2 );

        }else {

            wynik= podstawaPotegi *(potegowanie(podstawaPotegi, wykladnikPotegi/2))*potegowanie(podstawaPotegi,wykladnikPotegi/2 );
            return wynik;


        }

        // return wynik= podstawaPotegi *potegowanie(podstawaPotegi, (wykladnikPotegi-1)/2);

    }
}


