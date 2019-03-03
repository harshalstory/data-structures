package com.harshaltripathi.datastructures.linear.linkedlist;

public class SinglyLinkedList implements LinkedListI<Integer> {

	public Node<Integer> head;

	public void push(Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		node.next = head;
		head = node;
	}

	public NodeI<Integer> append(Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		Node<Integer> temp = head;
		if (temp == null) {
			head = node;
			return node;
		}
		while (temp.next != null)
			temp = temp.next;
		temp.next = node;
		return node;
	}

	public void insertAfter(NodeI<Integer> prevNode, Integer data) {
		Node<Integer> node = new Node<Integer>(data);

		Node<Integer> temp = head;

		if (prevNode == null) {
			return;
		}

		while (temp.next != null && temp != prevNode) {
			temp = temp.next;
		}

		node.next = temp.next;

		temp.next = node;
	}

	public void insertBefore(NodeI<Integer> afterNode, Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		if (afterNode == null) {
			return;
		}
		Node<Integer> temp = head;
		while (temp.next != null) {
			if (temp.next == afterNode) {
				node.next = temp.next;
				temp.next = node;
				temp = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
	}

	public void delete(Integer data) {
		if (head == null) {
			return;
		}
		Node<Integer> temp = head;

		if (head.data == data) {
			head = head.next;
			return;
		}

		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
			} else
				temp = temp.next;
		}
	}

	public void print(boolean withAddress) {
		Node<Integer> temp = head;
		int count = 0;
		if (temp != null) {
			System.out.println("Head is - " + head.data);
			System.out.print("[ ");
			do {
				if (withAddress)
					System.out.println("(" + temp + " | " + temp.data + " | " + temp.next + ") ");
				else
					System.out.print(temp.data + " ");
				count++;
				temp = temp.next;
			} while (temp != null);
		}
		System.out.println("]\nSize of the list is - " + count);
	}

}
