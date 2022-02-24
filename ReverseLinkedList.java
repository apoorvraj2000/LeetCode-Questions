package AllCodes;

public class ReverseLinkedList {

	 public ListNode reverseList(ListNode head) {
	        if(head==null || head.next==null)
	            return head;
	        
	        ListNode pre=null;
	        ListNode curr=head;
	        ListNode next=null;
	        
	        while(curr!=null){
	            next=curr.next;
	            curr.next=pre;
	            pre=curr;
	            curr=next;
	        }
	        return pre;
	    }
	 
}
