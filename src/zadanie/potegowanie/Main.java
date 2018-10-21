package zadanie.potegowanie;

public class Main {
    public static void main(String[] args) {
        Power power = new Power();
        DataReader reader = new DataReader();

        System.out.print("Wprowadź podstawę: ");
        int a = reader.getInt();
        System.out.print("Wprowadź potęgę: ");
        int b = reader.getInt();
        System.out.println();

        long timeStartRecurion = System.nanoTime();

        System.out.println(power.powerRecursion(a, b));
        long timeEndRecursion = System.nanoTime();
        System.out.println("szybkie potęgowanie rekurencja: " + (timeEndRecursion - timeStartRecurion) + " nanosekund");

        System.out.println(power.powerRecursionSlow(a, b));
        long timeEndSlow = System.nanoTime();
        System.out.println("potęgowanie rekurencja nieoptymalizowane: " + (timeEndSlow - timeEndRecursion) + " nanosekund");

        System.out.println(power.powerIteration(a, b));
        long timeEndIteration = System.nanoTime();
        System.out.println("potęgowanie iteracja: " + (timeEndIteration - timeEndSlow) + " nanosekund");
    }

}
