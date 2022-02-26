package AllCodes;

public class AddTwoNumbers {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        ListNode newHead=null;
	        ListNode newTail=null;
	        int carry=0;
	        while(l1!=null && l2!=null){
	            if(newHead==null){
	                int val=l1.val+l2.val;
	                if(val>9){
	                    carry=1;
	                    val=val%10;
	                }
	                ListNode nn=new ListNode(val);
	                newHead=nn;
	                newTail=nn;
	            }else{
	                int val=l1.val+l2.val+carry;
	                if(val>9){
	                    carry=1;
	                    val=val%10;
	                }else{
	                    carry=0;
	                }
	                ListNode nn=new ListNode(val);
	                newTail.next=nn;
	                newTail=nn;
	            }
	            l1=l1.next;
	            l2=l2.next;
	        }
	        while(l1!=null){
	             int val=l1.val+carry;
	                if(val>9){
	                    carry=1;
	                    val=val%10;
	                }else{
	                    carry=0;
	                }
	                ListNode nn=new ListNode(val);
	                newTail.next=nn;
	                newTail=nn;
	            
	             l1=l1.next;  
	        }
	        while(l2!=null){
	             int val=l2.val+carry;
	                if(val>9){
	                    carry=1;
	                    val=val%10;
	                }else{
	                    carry=0;
	                }
	                ListNode nn=new ListNode(val);
	                newTail.next=nn;
	                newTail=nn;
	            
	             l2=l2.next;  
	        }
	        if(carry!=0){
	             ListNode nn=new ListNode(carry);
	                newTail.next=nn;
	                newTail=nn;
	        }
	        return newHead;
	    }
}
