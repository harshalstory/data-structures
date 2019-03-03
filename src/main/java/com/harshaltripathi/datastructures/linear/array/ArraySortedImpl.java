package com.harshaltripathi.datastructures.linear.array;

public class ArraySortedImpl implements ArrayI {

	@Override
	public int find(int[] arr, int size, int key) {
		return binarySearch(arr, 0, size, key);
	}

	@Override
	public int insert(int[] arr, int size, int capacity, int key) {
		if (size >= capacity) {
			return size;
		}
		int i = 0;
		for (i = size - 1; (i >= 0 && arr[i] > key); i--) {
			System.out.println(print(arr, size));
			arr[i + 1] = arr[i];
		}
		arr[i + 1] = key;

		System.out.println(print(arr, size + 1));
		return (size + 1);
	}

	@Override
	public int delete(int[] arr, int size, int capacity, int key) {
		int position = find(arr, size, key);
		if (position < 0) {
			System.out.println("Element to be deleted is not present");
			return size;
		}
		for (int i = position; i < size; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println(print(arr, size - 1));
		return (size - 1);
	}

	private int binarySearch(int[] arr, int low, int high, int key) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;

		if (key == arr[mid]) {
			return mid;
		}

		if (key > arr[mid]) {
			return binarySearch(arr, (mid + 1), high, key);
		}
		return binarySearch(arr, low, (mid - 1), key);
	}

}
