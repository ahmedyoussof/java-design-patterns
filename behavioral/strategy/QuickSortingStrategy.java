package behavioral.strategy;

import java.util.Arrays;

public class QuickSortingStrategy implements SortingStrategy{

    @Override
    public void sort(int[] array) {
        System.out.println("Sorting array using quick sort ...");
        //simulate correct output
        Arrays.sort(array);
    }
}
