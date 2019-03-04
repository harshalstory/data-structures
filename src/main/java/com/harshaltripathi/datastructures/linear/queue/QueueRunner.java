package com.harshaltripathi.datastructures.linear.queue;

public class QueueRunner {
	
	public static void main(String[] args) {
		QueueI queue = new QueueImpl(5);
		
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.print();
		
		queue.dequeue();
		queue.dequeue();
		queue.print();
	}
}
