package Lec56;

import java.util.*;

public class DisJoinSet {
	class Node {
		int val;
		int rank;
		Node parent;
	}

	private HashMap<Integer, Node> map = new HashMap<>();

	public void create(int v) {
		Node nn = new Node();
		nn.val = v;
		nn.rank = 0;
		nn.parent = nn;
		map.put(v, nn);

	}

	public int find(int v) {
		Node node = map.get(v);
		return find(node).val;

	}

	private Node find(Node node) {
		if (node.parent == node) {
			return node;
		}
		Node n = find(node.parent);
		node.parent = n;// path Compression
		return n;

	}

	public void union(int v1, int v2) {
		Node node1 = map.get(v1);// v1 vtx kahan pe create hau hai
		Node node2 = map.get(v2);// v2 vtx kahan pe create hau hai
		Node re1 = find(node1);// v1 ka re node hai
		Node re2 = find(node2);// v2 ka re node hai
		if (re1.rank == re2.rank) {
			re1.parent = re2;
			re2.rank++;
		} else if (re1.rank < re2.rank) {
			re1.parent = re2;
		} else {
			re2.parent = re1;
		}
	}
}
