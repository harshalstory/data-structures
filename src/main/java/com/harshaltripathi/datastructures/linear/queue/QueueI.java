package com.harshaltripathi.datastructures.linear.queue;

public interface QueueI {
	
	int front();
	
	int last();
	
	boolean isEmpty();
	
	boolean isFull();
	
	void enqueue(int num);
	
	int dequeue();
	
	void print();

}
