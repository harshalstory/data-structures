package com.harshaltripathi.datastructures.linear.linkedlist;

public class CircularLinkedList implements LinkedListI<Integer> {

	int data;
	Node<Integer> head;

	@Override
	public void push(Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		Node<Integer> current = head;
		node.next = head;
		if (head != null) {
			while (current.next != head) {
				current = current.next;
			}
			current.next = node;
		} else {
			node.next = node;
		}
		head = node;
	}

	@Override
	public NodeI<Integer> append(Integer data) {
		Node<Integer> node = new Node<Integer>(data);

		if (head == null) {
			node.next = node;
			head = node;
			return node;
		}
		Node<Integer> current = head;
		while (current.next != head) {
			current = current.next;
		}
		node.next = current.next;
		current.next = node;
		return node;
	}

	@Override
	public void insertAfter(NodeI<Integer> prevNode, Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		if (head == null) {
			return;
		}
		Node<Integer> current = head;
		while (current.next != head && current != prevNode) {
			current = current.next;
		}
		if (current == prevNode) {
			node.next = current.next;
			current.next = node;
		}
	}

	@Override
	public void insertBefore(NodeI<Integer> afterNode, Integer data) {
		Node<Integer> node = new Node<Integer>(data);
		if (head == null) {
			return;
		}
		Node<Integer> current = head;
		while (current.next != head && current.next != afterNode) {
			current = current.next;
		}
		if (current.next == afterNode) {
			node.next = current.next;
			current.next = node;
		}
	}

	@Override
	public void delete(Integer data) {
		if (head == null) {
			return;
		}
		Node<Integer> current = head;
		Node<Integer> prev = head;

		if (head.data == data) {
			if (head.next == head)
				head = null;
			else {
				while (current.next != head) {
					current = current.next;
				}
				current.next = head.next;
				head = head.next;
			}
			return;
		}
		while (current.next != head && current.data != data) {
			prev = current;
			current = current.next;
		}
		if (current.data == data) {
			prev.next = current.next;
		}
	}

	@Override
	public void print(boolean withAddress) {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		int count = 0;
		Node<Integer> current = head;
		System.out.println("\nHead of the list is - " + head.data);
		System.out.print("[ ");
		do {
			if (withAddress)
				System.out.print("( " + current + " | " + current.data + " | " + current.next + " )");
			else
				System.out.print(current.data + " ");
			count++;
			current = current.next;
		} while (current != head);
		System.out.println("]\nSize of the circular linked list is - " + count);
	}

}
