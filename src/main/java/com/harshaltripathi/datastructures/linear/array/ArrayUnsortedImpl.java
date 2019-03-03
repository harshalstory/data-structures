package com.harshaltripathi.datastructures.linear.array;

class ArrayUnsortedImpl implements ArrayI {

	@Override
	public int find(int[] arr, int size, int key) {
		if (size < 1) {
			return -1;
		}
		for (int i = 0; i < size - 1; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int insert(int[] arr, int size, int capacity, int key) {
		if (size >= capacity) {
			return size;
		}

		arr[size] = key;

		System.out.println(print(arr, size + 1));
		return size + 1;
	}

	@Override
	public int delete(int[] arr, int size, int capacity, int key) {
		int position = find(arr, capacity, key);

		if (position == -1) {
			System.out.println("Element to delete was not found");
			return size;
		}

		for (int i = position; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		System.out.println(print(arr, size - 1));
		return size - 1;
	}
}
