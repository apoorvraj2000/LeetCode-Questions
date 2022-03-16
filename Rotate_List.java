package AllCodes;

public class Rotate_List {

	 public ListNode rotateRight(ListNode head, int k) {
	        if(head==null || k==0)
	            return head;
	        
	        // will hold last node of linked list
	        ListNode lastNode=head;
	        //length of LL
	        int size=1;
	        
	        while(lastNode.next!=null){
	            lastNode=lastNode.next;
	            size++;
	        }
	        // mod with length to make k in range
	        k=size-(k%size);
	        ListNode newTail = head;
	        for(int i=1;i<k;i++){
	             newTail=newTail.next;
	        }
	       
	        lastNode.next=head;
	        head=newTail.next;
	        newTail.next=null;
	        
	        return head;
	    }
}
