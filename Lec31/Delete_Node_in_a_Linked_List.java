package Lec31;

public class Delete_Node_in_a_Linked_List {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
		 
		class Solution {
		    public void deleteNode(ListNode node) {
		        node.val=node.next.val;
		        ListNode nn=node.next;
		        node.next=node.next.next;
		        nn.next=null;
		    }
		}
}
