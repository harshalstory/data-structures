package com.harshaltripathi.datastructures.linear.linkedlist;

public class Node<T> implements NodeI {

	public T data;
	public Node<T> next;

	public Node(T data) {
		this.data = data;
	}

}
