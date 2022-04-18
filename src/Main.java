import java.util.Random;
import java.util.Arrays;
import java.text.NumberFormat;

import sort.*;

public class Main {

	public static void main(String[] args) {
	   int arrSize = 100000;
	   NumberFormat numform = NumberFormat.getInstance();
	   System.out.println("sorting " + numform.format(arrSize) + " elements...");
	
		int[] arr = new int[arrSize];
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
		}
		
		int[] arrQuick = Arrays.copyOf(arr, arrSize);
		int[] arrBubble = Arrays.copyOf(arr, arrSize);
		int[] arrSelection = Arrays.copyOf(arr, arrSize);
		
		// run programs here
		QuickSort.quickSort(arrQuick);
		//printArray(arrBubble);
		BubbleSort.bubbleSort(arrBubble);
		//printArray(arrBubble);
		SelectionSort.selectionSort(arrSelection);
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("[");
			}
			
			if (i > 0 && i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			}
			
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			}
		}
	}
}