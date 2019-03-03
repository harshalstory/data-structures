package com.harshaltripathi.datastructures.linear.linkedlist;

public class DoublyLinkedList implements LinkedListI<Integer> {

	public DoublyNode<Integer> head;

	public void push(Integer data) {
		DoublyNode<Integer> node = new DoublyNode<Integer>(data);

		if (head == null) {
			head = node;
			return;
		}
		head.prevNode = node;
		node.next = head;
		head = node;
	}

	public NodeI<Integer> append(Integer data) {
		DoublyNode<Integer> node = new DoublyNode<Integer>(data);
		if (head == null) {
			head = node;
			return head;
		}
		DoublyNode<Integer> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prevNode = temp;
		return node;
	}

	public void insertAfter(NodeI<Integer> prevNode, Integer data) {
		DoublyNode<Integer> node = new DoublyNode<Integer>(data);
		if (head == null) {
			head = node;
			return;

		}
		DoublyNode<Integer> temp = head;
		while (temp.next != null && temp != prevNode) {
			temp = temp.next;
		}
		node.next = temp.next;
		node.prevNode = temp;
		temp.next = node;
	}

	public void insertBefore(NodeI<Integer> afterNode, Integer data) {
		DoublyNode<Integer> node = new DoublyNode<Integer>(data);

		if (head == null) {
			head = node;
			return;
		}

		DoublyNode<Integer> temp = head;

		while (temp != null && temp != afterNode) {
			temp = temp.next;
		}
		node.prevNode = temp.prevNode;
		node.next = temp;
		temp.prevNode = node;

		if (node.prevNode != null) {
			node.prevNode.next = node;
		} else {
			head = node;
		}
	}

	public void delete(Integer data) {
		if (head == null) {
			return;
		}
		DoublyNode<Integer> temp = head;
		if (head.data == data)
			head = temp.next;
		while (temp.next != null) {
			if (temp.data == data) {
				if (temp.prevNode != null)
					temp.prevNode.next = temp.next;
				if (temp.next != null)
					temp.next.prevNode = temp.prevNode;
			}
			temp = temp.next;
		}
	}

	public void print(boolean withAddress) {
		DoublyNode<Integer> temp = head;
		int count = 0;
		if (temp != null) {
			System.out.println("Head is - " + head.data);
			System.out.print("[ ");
			do {
				if (withAddress)
					System.out.println("(" + temp.prevNode + " | " + temp + "-" + temp.data + " | " + temp.next + ") ");
				else
					System.out.print(temp.data + " ");
				count++;
				temp = temp.next;
			} while (temp != null);
		}
		System.out.println("]\nSize of the list is - " + count);
	}

}
