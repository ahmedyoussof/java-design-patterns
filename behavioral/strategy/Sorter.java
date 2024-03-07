package behavioral.strategy;

public class Sorter {

    private SortingStrategy strategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.strategy = sortingStrategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
