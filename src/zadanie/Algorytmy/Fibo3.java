package zadanie.Algorytmy;

import java.util.Scanner;

public class Fibo3 {
    static long n1=1,n2=1,n3=0;
    static void printFibonacci(long count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        long count= scanner.nextInt();
        System.out.print(n1+" "+n2);
        printFibonacci(count-2);

        //System.out.println(fibonacci(scanner.nextInt()));
        System.out.println(fibonacciTrojargument(scanner.nextInt()));
    }

    public static long fibonacci(long liczba){
        if(liczba<2){
            return liczba;
        }else {
            return fibonacci(liczba-1) + fibonacci(liczba-2);
        }
    }

    private static long fibonacciTrojargument(long liczba){
        return liczba<2? liczba : fibonacci(liczba-1) + fibonacci(liczba-2);
    }
}
