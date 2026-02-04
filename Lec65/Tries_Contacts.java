package Lec65;

import java.util.HashMap;

public class Tries_Contacts {

	class Node {
		char ch;
		boolean isterminal;
		HashMap<Character, Node> child;
		int count = 1;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
		}
	}

	private Node root;

	public Tries_Contacts() {
		root = new Node('*');
	}

	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}
		}
		curr.isterminal = true;

	}
	public int find(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.count;
	}

}
