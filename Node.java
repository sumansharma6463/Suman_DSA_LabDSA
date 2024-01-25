package com.greatlearning.lab3;

public class Node {
	public int value;
	public Node left;
	public Node right;

	static Node newNode(int data) {
		Node temp = new Node();
		temp.value = data;
		temp.left = null;
		temp.right = null;

		return temp;
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			return newNode(value);
		}
		if (value < root.value) {
			root.left = insert(root.left, value);
		} else if (value >= root.value) {
			root.right = insert(root.right, value);
		}
		return root;
	}

}
