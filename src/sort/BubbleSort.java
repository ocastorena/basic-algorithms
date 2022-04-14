package sort;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		// execution time start
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Bubble Sort execution time is " + (double)(endTime - startTime)/1000 + " seconds");
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}