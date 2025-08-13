package Lec41;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return createTree(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
		}

		public TreeNode createTree(int[] in, int[] pre, int ilo, int ihi, int plo, int phi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int c = idx - ilo;
			node.left = createTree(in, pre, ilo, idx - 1, plo + 1, plo + c);
			node.right = createTree(in, pre, idx + 1, ihi, plo + c + 1, phi);
			return node;

		}

		public int search(int[] in, int ilo, int ihi, int item) {
			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}

			}
			return 0;
		}
	}
}
