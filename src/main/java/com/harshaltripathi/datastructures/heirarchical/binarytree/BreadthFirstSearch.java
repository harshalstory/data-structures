package com.harshaltripathi.datastructures.heirarchical.binarytree;

public class BreadthFirstSearch {

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

	private void search(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.data + " ");
		} else if (level > 1) {
			search(root.left, level - 1);
			search(root.right, level - 1);
		}

	}

	public void traverse(Node root) {
		int height = height(root);
		for (int i = 0; i < height; i++) {
			search(root, i);
		}
	}

}
