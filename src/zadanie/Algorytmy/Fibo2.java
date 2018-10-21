package zadanie.Algorytmy;

public class Fibo2 {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacciTrojargument(10));
    }

    public static int fibonacci(int liczba){
        if(liczba<2){
            return liczba;
        }else {
            return fibonacci(liczba-1) + fibonacci(liczba-2);
        }
    }

    private static int fibonacciTrojargument(int liczba){
        return liczba<2? liczba : fibonacci(liczba-1) + fibonacci(liczba-2);
    }
}
