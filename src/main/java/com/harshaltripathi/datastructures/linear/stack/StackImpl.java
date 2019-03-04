package com.harshaltripathi.datastructures.linear.stack;

public class StackImpl implements StackI {

	int[] arr;
	int top;
	int size;

	public StackImpl(int capacity) {
		arr = new int[capacity];
		top = -1;
		size = 0;
	}

	@Override
	public int peek() {
		if (top < 0) {
			System.out.println("Stack is empty!");
			return 0;
		}
		return arr[top];
	}

	@Override
	public void push(int item) {
		if (top >= size) {
			System.out.println("Stack overflow");
		}
		arr[++top] = item;
		size++;
	}

	@Override
	public int pop() {
		if (top < 0) {
			System.out.println("Stack underflow");
		}
		return arr[top--];
	}

	@Override
	public void print() {
		if (top < 0) {
			System.out.println("Stack is empty");
			return;
		}
		int i = 0;
		while (i < size) {
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println("Size of stack is - " + size);
	}

}
