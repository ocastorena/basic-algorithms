import java.util.Random;
import java.util.Arrays;

import sort.*;

public class Main {

	public static void main(String[] args) {
	   int arrSize = 1000;
	
		int[] arr = new int[arrSize];
		int[] arrQuick = new int[arrSize];
		int[] arrBubble = new int[arrSize];
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
		}
		
		arrQuick = Arrays.copyOf(arr, arrSize);
		arrBubble = Arrays.copyOf(arr, arrSize);
		
		// run programs here
		//quickSort(arrQuick);
		printArray(arrBubble);
		BubbleSort.bubbleSort(arrBubble);
		printArray(arrBubble);
		
	}
	
	private static void quickSort(int[] arr) {
		printArray(arr);
		// execution time start
		long startTime = System.currentTimeMillis();
		
		// run programs here
		quickSort(arr, 0, arr.length - 1);
		
		// execution time end and print
		long endTime = System.currentTimeMillis();
		printArray(arr);
		System.out.println("Execution time is " + (double)(endTime - startTime)/1000 + " seconds");
	}
	
	private static void quickSort(int[] array, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);
	}
	
	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;
		
		while (leftPointer < rightPointer) {
			
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			swap(array, leftPointer, rightPointer);
		}
		
		if(array[leftPointer] > array[highIndex]) {
          swap(array, leftPointer, highIndex);
      } else {
          leftPointer = highIndex;
      }
		
		return leftPointer;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
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