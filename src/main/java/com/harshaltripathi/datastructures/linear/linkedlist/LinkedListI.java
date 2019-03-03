package com.harshaltripathi.datastructures.linear.linkedlist;

public interface LinkedListI<T> {

	void push(T data);

	NodeI<Integer> append(T data);

	void insertAfter(NodeI<T> prevNode, T data);

	void insertBefore(NodeI<T> afterNode, T data);

	void delete(T data);

	void print(boolean withAddress);

}
