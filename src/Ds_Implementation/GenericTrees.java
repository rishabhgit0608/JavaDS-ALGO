package Ds_Implementation;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTrees {
	public static class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	public static Node construct(int[] arr) {
		Node root = new Node(arr[0]);
		Stack<Node> st = new Stack<>();
		st.push(root);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == -1) {
				st.pop();
			} else {
				Node n = new Node(arr[i]);
				st.peek().children.add(n);
				st.push(n);
			}
		}
		return root;
	}

	public static void display(Node root) {
		String str = "";
		str += root.data + "=>";
		for (Node child : root.children) {
			str += child.data + ", ";
		}
		str += ".";
		System.out.println(str);
		for (Node child : root.children) {
			display(child);
		}
	}

	public static int size(Node root) {
		int s = 0;
		for (Node child : root.children) {
			s += size(child);
		}
		return s + 1;
	}

	public static int max(Node root) {
		int max = root.data;
		for (Node child : root.children) {
			max = Math.max(max(child), max);
		}
		return max;
	}

	public static void main(String args[]) {
		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, -1, 90, -1, -1, 40, 100, 110, -1, 120, -1, -1, -1,
				-1 };
		Node root = GenericTrees.construct(arr);
		GenericTrees.display(root);
		System.out.println(GenericTrees.size(root));

		System.out.println(GenericTrees.max(root));
	}

}
