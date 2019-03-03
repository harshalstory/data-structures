package com.harshaltripathi.datastructures.linear.array;

public interface ArrayI {
	int find(int[] arr, int size, int key);

	int insert(int[] arr, int size, int capacity, int key);

	int delete(int[] arr, int size, int capacity, int key);

	default String print(int[] arr, int size) {
		String message = "";
		if (arr.length == 0) {
			message = "The array is empty";
		} else {
			for (int i = 0; i < size; i++) {
				message += arr[i];
				if (i < size - 1) {
					message += ", ";
				}
			}
		}
		return message;
	}
}
