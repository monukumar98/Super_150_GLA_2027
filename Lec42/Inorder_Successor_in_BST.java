package Lec42;

public class Inorder_Successor_in_BST {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		TreeNode successorNode = null;

		public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
			return Successor(root, p);
		}

		public TreeNode Successor(TreeNode root, TreeNode p) {
			if (root == null) {
				return null;
			}
			if (root.val > p.val) {
				successorNode = root;
				Successor(root.left, p);
			} else {
				Successor(root.right, p);
			}
			return successorNode;
		}
	}

}
