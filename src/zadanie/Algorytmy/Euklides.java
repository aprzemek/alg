package zadanie.Algorytmy;


public class Euklides {


     static int NWD(int pierwsza, int druga)
    {
        if (druga == 0)
        {
            return pierwsza;
        }
        else
        {
            return NWD (druga, pierwsza%druga);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(NWD(1680,640));
    }
}