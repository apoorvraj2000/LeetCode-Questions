package AllCodes;

public class Convert_Sorted_List_to_Binary_Search_Tree {

	 public TreeNode sortedListToBST(ListNode head) {
	        if(head==null)
	            return null;
	        
	        if(head.next==null)
	            return new TreeNode(head.val);
	        
	        ListNode pre=head;
	        ListNode slow=head;
	        ListNode fast=head;
	        
	        while(fast!=null && fast.next!=null){
	            pre=slow;
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        
	        TreeNode root=new TreeNode(slow.val);
	        pre.next=null;
	        root.left=sortedListToBST(head);
	        root.right=sortedListToBST(slow.next);
	        
	        return root;
	    }
}
