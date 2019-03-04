package com.harshaltripathi.datastructures.linear.queue;

public class QueueImpl implements QueueI {

	int front, rear, size, capacity;
	int[] arr;

	public QueueImpl(int capacity) {
		this.capacity = capacity;
		this.front = this.size = 0;
		this.rear = capacity - 1;
		this.arr = new int[capacity];
	}

	@Override
	public int front() {
		if (this.size < 1) {
			return Integer.MIN_VALUE;
		}
		return this.arr[this.front];
	}

	@Override
	public int last() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return this.arr[this.rear];
	}

	@Override
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	public boolean isFull() {
		return this.size == this.capacity;
	}

	@Override
	public void enqueue(int num) {
		if (isFull()) {
			System.out.println("Queue full");
			return;
		}
		this.rear = (this.rear + 1) % this.capacity;
		this.arr[this.rear] = num;
		this.size = this.size + 1;
	}

	@Override
	public int dequeue() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		int item = this.arr[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	@Override
	public void print() {
		System.out.print("\n[");
		for(int i = this.front; i <= this.rear;i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.print("]");
		System.out.println("Size of the queue is - " + size);
	}

}
