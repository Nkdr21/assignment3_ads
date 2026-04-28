public class Main {
    public static void main(String[] args) {

        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment();

        // small demo first
        System.out.println(" Demo with small array ");
        int[] arr = sorter.generateRandomArray(10);

        System.out.print("Original:    ");
        sorter.printArray(arr);

        int[] arr2 = arr.clone();
        sorter.basicSort(arr2);
        System.out.print("Bubble Sort: ");
        sorter.printArray(arr2);

        int[] arr3 = arr.clone();
        sorter.advancedSort(arr3);
        System.out.print("Merge Sort:  ");
        sorter.printArray(arr3);

        int target = arr3[5];
        int result = searcher.search(arr3, target);
        System.out.println("Binary Search for " + target + " >> index: " + result);

        System.out.println();

        // run all experiments
        experiment.runAllExperiments();
    }
}