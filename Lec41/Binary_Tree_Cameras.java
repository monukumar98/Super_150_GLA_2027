package Lec41;

public class Binary_Tree_Cameras {

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
		int Camera = 0;

		public int minCameraCover(TreeNode root) {
			int c = minCamera(root);
			if (c == -1) {
				Camera++;
			}
			return Camera;

		}

		public int minCamera(TreeNode root) {
			if (root == null) {
				return 0;
			}

			int left = minCamera(root.left);
			int right = minCamera(root.right);
			if (left == -1 || right == -1) {// is node Camera ki need hai
				Camera++;
				return 1;// Camera setup kra is node pe
			} else if (left == 1 || right == 1) {// inme se koi ek pass ya dono ke pass Camera hai or ek pass Camera hai
													// and dusra wala coverd hai
				return 0;// iska mtlb mei coverd hu
			} else {
				return -1;// need a Camera
			}

		}
	}

}
