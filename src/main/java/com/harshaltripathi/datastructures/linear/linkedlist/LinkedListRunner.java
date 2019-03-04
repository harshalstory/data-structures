package com.harshaltripathi.datastructures.linear.linkedlist;

public class LinkedListRunner {

	public static void main(String[] args) {
		demoSinglyCircularLinkedList(false);
	}

	private static void demoSinglyLinkedList(final boolean isDebugOn) {
		LinkedListI<Integer> list = new SinglyLinkedList();

		list.push(5);
		list.push(2);
		list.push(7);
		list.push(9);
		list.push(13);

		NodeI<Integer> node = list.append(4);
		list.append(3);
		list.append(1);

		list.insertAfter(node, 15);

		list.insertBefore(node, 11);

		list.print(false);

		list.delete(9);

		list.print(isDebugOn);
	}

	private static void demoDoublyLinkedList(final boolean isDebugOn) {
		LinkedListI<Integer> list = new DoublyLinkedList();

		list.push(5);
		list.push(2);
		list.push(7);
		list.push(9);
		list.push(13);

		NodeI<Integer> node = list.append(4);
		list.append(3);
		list.append(1);
		list.print(isDebugOn);

		list.insertAfter(node, 15);
		list.print(isDebugOn);

		list.insertBefore(node, 11);
		list.print(isDebugOn);

		list.delete(1);

		list.print(isDebugOn);

	}

	private static void demoSinglyCircularLinkedList(final boolean isDebugOn) {
		LinkedListI<Integer> list = new CircularLinkedList();

		list.push(5);
		list.push(2);
		list.push(7);
		list.push(9);
		list.push(13);

		NodeI<Integer> node = list.append(4);
		list.append(3);
		list.append(1);

		list.print(isDebugOn);

		list.insertAfter(node, 15);
		list.print(isDebugOn);

		list.insertBefore(node, 11);
		list.print(isDebugOn);
		
		list.delete(13);
		
		list.delete(4);
		list.print(isDebugOn);
		
	}
}
