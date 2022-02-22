package AllCodes;

 class ListNode {
	      int val;
	     ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
 
public class MergeTwoSortedLists {

	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        if(list1==null)
	            return list2;
	        if(list2==null)
	            return list1;
	        
	        ListNode newHead=null;
	        ListNode newTail=null;
	         if(list1.val<=list2.val){
	                newHead=list1;
	                newTail=list1;
	                list1=list1.next;
	            }else{
	                newHead=list2;
	                newTail=list2;
	                list2=list2.next;
	            }
	        while(list1!=null && list2!=null){
	            if(list1.val<=list2.val){
	                newTail.next=list1;
	                newTail=list1;
	                list1=list1.next;
	            }else{
	                newTail.next=list2;
	                newTail=list2;
	                list2=list2.next;
	            }
	        }
	        if(list1!=null)
	            newTail.next=list1;
	        if(list2!=null)
	            newTail.next=list2;
	        
	        return newHead;
	    }
}
