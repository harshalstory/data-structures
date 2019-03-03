package com.harshaltripathi.datastructures.linear.array;

public class ArrayRunner {
	private static final int capacity = 10;

	public static void main(String[] args) {
		demoUnsortedArray();
		demoSortedArray();
	}

	private static void demoUnsortedArray() {
		System.out.println("\n===================== UNSORTED ======================");
		int[] arr = new int[capacity];
		int size = 0;

		ArrayI unsortedOps = new ArrayUnsortedImpl();
		// Inserting into Array
		size = unsortedOps.insert(arr, size, capacity, 2);
		size = unsortedOps.insert(arr, size, capacity, 4);
		size = unsortedOps.insert(arr, size, capacity, 6);
		size = unsortedOps.insert(arr, size, capacity, 8);

		System.out.println("Finding element 4");
		// Finding from the array
		int foundAtIndex = unsortedOps.find(arr, size, 4);
		System.out.println("Element at index - " + foundAtIndex);

		System.out.println("Deleting element 4");
		// Deleting from the array
		size = unsortedOps.delete(arr, size, capacity, 4);
	}

	private static void demoSortedArray() {
		System.out.println("\n====================== SORTED =======================");
		ArrayI sortedOps = new ArraySortedImpl();

		int[] arr = new int[capacity];
		int size = 0;

		// Inserting into Array
		size = sortedOps.insert(arr, size, capacity, 1);
		size = sortedOps.insert(arr, size, capacity, 3);
		size = sortedOps.insert(arr, size, capacity, 5);
		size = sortedOps.insert(arr, size, capacity, 7);
		size = sortedOps.insert(arr, size, capacity, 9);

		System.out.println("Finding element 7");
		// Finding from the array
		int foundAtIndex = sortedOps.find(arr, size, 7);
		System.out.println("Element at index - " + foundAtIndex);

		System.out.println("Deleting element 5");
		// Deleting from the array
		size = sortedOps.delete(arr, size, capacity, 5);
	}

}
