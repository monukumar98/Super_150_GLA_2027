package Lec42;

public class Serialize_and_Deserialize_Binary_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public class Codec {

		// Encodes a tree to a single string.
		public String serialize(TreeNode root) {
			StringBuilder sb = new StringBuilder();
			build(root, sb);
			return sb.toString();

		}

		private void build(TreeNode root, StringBuilder sb) {
			// TODO Auto-generated method stub
			if (root == null) {
				sb.append("null,");
				return;
			}

			sb.append(root.val).append(",");
			build(root.left, sb);
			build(root.right, sb);

		}

		// Decodes your encoded data to tree.
		public TreeNode deserialize(String data) {
			if (data == null || data.isEmpty()) {
				return null;
			}
			String[] arr = data.split(",");
			return parse(arr);

		}

		int idx = 0;

		public TreeNode parse(String[] arr) {
			if (idx >= arr.length) {
				return null;
			}
			String s = arr[idx++];
			if (s.equals("null")) {
				return null;
			}
			TreeNode node = new TreeNode(Integer.parseInt(s));
			node.left = parse(arr);
			node.right = parse(arr);
			return node;

		}
	}
}
