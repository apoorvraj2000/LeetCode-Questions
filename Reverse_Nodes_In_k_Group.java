package AllCodes;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

public class Reverse_Nodes_In_k_Group {
	public ListNode reverseKGroup(ListNode head, int k) {
	       if(head==null )
	           return head;
	        
	        ListNode curr=head;
	        ListNode pre=null;
	        ListNode next=head;
	        int countJump=0;
	        while(countJump<k && curr!=null){
	            next=curr.next;
	            curr.next=pre;
	            pre=curr;
	            curr=next;
	            countJump++;
	        }
	        
	        if(kLength(curr,k))
	            head.next=reverseKGroup(curr,k);
	        else
	            head.next=curr;
	        
	        return pre;
	    }
	    public boolean kLength(ListNode head,int k){
	        ListNode curr=head;
	        for(int i=0;i<k;i++){
	            if(curr==null)
	                return false;
	            curr=curr.next;
	        }
	        return true;
	    }
}
