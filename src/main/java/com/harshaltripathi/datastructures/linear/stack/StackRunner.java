package com.harshaltripathi.datastructures.linear.stack;

public class StackRunner {
	
	public static void main(String[] args) {
		StackI stack = new StackImpl(5);
		
		stack.push(5);
		stack.push(2);
		stack.push(7);
		
		stack.print();
		System.out.println("Top of the stack is - " + stack.peek());
		
		stack.pop();
		stack.print();
		System.out.println("Top of the stack is - " + stack.peek());
		
	}
}
