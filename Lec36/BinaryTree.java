package Lec36;

import java.util.Scanner;

public class BinaryTree {
	class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;
	Scanner sc = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();// has left chlid
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();// has right chlid
		if (hrc) {
			nn.right = CreateTree();
		}
		return nn;

	}
	public void Display(){
		Display(root);
	}
	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "<--" + nn.val + "-->";
		if (nn.left != null) {
			str = nn.left.val + str;
		} else {
			str = "." + str;
		}
		if (nn.right != null) {
			str = str + nn.right.val;
		} else {
			str = str + ".";
		}
		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
	}

}
