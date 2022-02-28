package AllCodes;

public class Remove_Nth_Node_From_End_of_List {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        int len=size(head);
	        int move=len-n;
	      
	        //To remove Head
	        if(move==0){
	            head=head.next;
	            return head;
	        }
	        //To remove any other Node
	        ListNode curr=head;
	        while(move>1&& curr!=null){
	            curr=curr.next;
	            move--;
	        }
	        
	        ListNode temp=curr.next.next;
	        curr.next=temp;
	        return head;
	        
	    }
	    public int size(ListNode head){
	        int size=0;
	        while(head!=null){
	            size++;
	            head=head.next;
	        }
	        return size;
	    }
}
