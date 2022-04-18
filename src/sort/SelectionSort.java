package sort;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        long startTime = System.currentTimeMillis();
        sort(array);
        long endTime = System.currentTimeMillis();
        System.out.println("Selection Sort execution time is " + (double)(endTime - startTime)/1000 + " seconds");
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }

            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
