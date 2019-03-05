package com.harshaltripathi.datastructures.heirarchical.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	public void insert(int data) {
		if (root == null) {
			this.root = new Node(data);
			return;
		}

		Queue<Node> q = new LinkedList<Node>();
		q.add(this.root);
		Node temp;
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(data);
				break;
			} else {
				q.add(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node(data);
				break;
			} else {
				q.add(temp.right);
			}
		}
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		}

		int lheight = height(root.left) + 1;
		int rheight = height(root.right) + 1;

		if (lheight > rheight) {
			return lheight;
		} else {
			return rheight;
		}
	}

	private String postOrderTraversal(Node root, StringBuilder result) {
		if (root == null) {
			return "";
		}

		postOrderTraversal(root.left, result);

		postOrderTraversal(root.right, result);

		result.append(root.data);
		result.append(" ");

		return result.toString();
	}
	
	private String inOrderTraversal(Node root, StringBuilder result) {
		if(root == null) {
			return "";
		}
		
		inOrderTraversal(root.left, result);
		
		result.append(root.data);
		result.append(" ");
		
		inOrderTraversal(root.right, result);
		
		return result.toString();
	}

	public void print() {
		System.out.println("Height of the tree is - " + height(root));
		StringBuilder result = new StringBuilder("");
		System.out.println(inOrderTraversal(this.root, result));
	}

}
