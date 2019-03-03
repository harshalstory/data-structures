package com.harshaltripathi.datastructures.linear.linkedlist;

public class DoublyNode<T> implements NodeI {

	public T data;
	public DoublyNode<T> next;
	public DoublyNode<T> prevNode;

	public DoublyNode(T data) {
		this.data = data;
	}

}
