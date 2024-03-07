package behavioral.strategy;

import java.util.Arrays;

public class BubbleSortingStrategy implements SortingStrategy{

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting array using bubble sort ...");
        //simulate correct output
        Arrays.sort(array);
    }
}
