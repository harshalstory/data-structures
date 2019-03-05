package com.harshaltripathi.datastructures.heirarchical.binarytree;

public class BinaryTreeRunner {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(5);
		tree.insert(2);
		tree.insert(7);
		tree.insert(9);
		tree.insert(13);
		tree.insert(11);
		tree.insert(4);
		tree.insert(15);
		BreadthFirstSearch search = new BreadthFirstSearch();
		
		search.traverse(tree.root);
	}

}
