package zadanie.Algorytmy;
import java.util.ArrayList;
import java.util.Random;

public class AlgorytmWyszukiwaniaProstego
{

    public static void main(String[] args) {


        ArrayList m = new ArrayList();
        Random generator = new Random();

        for(int i=0; i<1; i++) {

            m.add(generator.nextInt(1000));
        }
        System.out.println(m);

        for(int i=0; i<10; i++) {

            m.add(generator.nextInt(1000));
        }
        System.out.println(m);
    }



}
