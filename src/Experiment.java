import java.util.Arrays;

public class Experiment {

    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();
        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }
        long end = System.nanoTime();

        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        long start = System.nanoTime();
        searcher.search(sorted, target);
        long end = System.nanoTime();

        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        System.out.println(" Experiment Results \n");

        for (int size : sizes) {
            System.out.println(" Array size: " + size + " ");

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = Arrays.copyOf(randomArr, randomArr.length);
            Arrays.sort(sortedArr);

            int target = randomArr[size / 2];

            long b1 = measureSortTime(randomArr, "basic");
            long b2 = measureSortTime(sortedArr, "basic");
            long m1 = measureSortTime(randomArr, "advanced");
            long m2 = measureSortTime(sortedArr, "advanced");
            long s1 = measureSearchTime(randomArr, target);

            System.out.println("Bubble Sort (random): " + b1 + " ns");
            System.out.println("Bubble Sort (sorted): " + b2 + " ns");
            System.out.println("Merge Sort  (random): " + m1 + " ns");
            System.out.println("Merge Sort  (sorted): " + m2 + " ns");
            System.out.println("Binary Search:        " + s1 + " ns");
            System.out.println();
        }
    }
}