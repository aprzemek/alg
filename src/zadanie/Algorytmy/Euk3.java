package zadanie.Algorytmy;

public class Euk3 {
    public static void main(String[] args) {


        int a = 1680;
        int b = 640;
        System.out.println(euklides(a,b));

    }
        public static int euklides ( int a, int b){
            if (b == 0) {
                return a;
            } else {
                return euklides(b, a % b);
            }
        }
    }
