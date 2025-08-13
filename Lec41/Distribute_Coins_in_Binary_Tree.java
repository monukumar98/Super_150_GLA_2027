package Lec41;

public class Distribute_Coins_in_Binary_Tree {
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
		int ans = 0;

		public int distributeCoins(TreeNode root) {
			minmove(root);
			return ans;
		}

		public int minmove(TreeNode root) {
			if (root == null) {
				return 0;
			}
			int left = minmove(root.left);
			int right = minmove(root.right);
			ans = ans + Math.abs(left) + Math.abs(right);
			return root.val + left + right - 1;

		}
	}
}




