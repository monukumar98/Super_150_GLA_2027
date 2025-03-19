package Lec30;



public class Linked_List_Cycle {
	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
		 
		public class Solution {
		    public boolean hasCycle(ListNode head) {
		    	ListNode slow = head;
				ListNode Fast = head;
				while (Fast != null && Fast.next != null) {
					slow = slow.next;
					Fast = Fast.next.next;
	                 if(slow==Fast) {
	                	 return true;
	                 }
				}
				return false;  
		    }
		}

}
