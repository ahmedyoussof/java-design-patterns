package behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 4};
        Sorter sorter = new Sorter(new BubbleSortingStrategy());
        sorter.sort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        int[] array2 = {10, 7, 9, 8, 6};
        sorter = new Sorter(new QuickSortingStrategy());
        sorter.sort(array2);

        for (int i : array2) {
            System.out.print(i + " ");
        }
    }
}
