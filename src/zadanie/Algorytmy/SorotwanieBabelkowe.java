package zadanie.Algorytmy;

import java.util.Arrays;
import java.util.Random;

public class SorotwanieBabelkowe {
    public static void main(String[] args) {

        int[] array = generujTablice();
        System.out.println("Wygenerowana tablica : " + Arrays.toString(array));
        System.out.println("Posortowana tablica : " + Arrays.toString(sortujTablice(array)));
    }

    public static int[] generujTablice() {
        Random rand = new Random();
        int arraySize = rand.nextInt(10) + 1;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }

    public static int[] sortujTablice(int[] array) {
        int[] sortedArray = array.clone();
        boolean hasChanged;
        do {
            hasChanged=false;
            for(int i=1; i<sortedArray.length; i++) {
                if(sortedArray[i]<sortedArray[i-1]) {
                    int temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i-1];
                    sortedArray[i-1] = temp;
                    hasChanged=true;
                }
            }
        }while(hasChanged);
        return sortedArray;
    }
}