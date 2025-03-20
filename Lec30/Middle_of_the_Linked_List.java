package Lec30;

public class Middle_of_the_Linked_List {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode Fast = head;
			while (Fast != null && Fast.next != null) {
				slow = slow.next;
				Fast = Fast.next.next;
                 
			}
			return slow;
		}
	}

}
