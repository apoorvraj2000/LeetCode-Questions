package AllCodes;

public class Merge_k_Sorted_Lists {

	public ListNode mergeKLists(ListNode[] lists) {
	       if(lists.length==0) return null;
	        
	        return sort(lists,0,lists.length-1);
	    }
	    
	    public ListNode sort(ListNode[] lists, int si, int ei) {
	        if(si==ei){
	            return lists[si];
	        }
	        int mid=(si+ei)/2;
	        ListNode firstPart=sort(lists,si,mid);
	        ListNode secondPart=sort(lists,mid+1,ei);
	        
	        return merge(firstPart,secondPart);
	    }
	    public ListNode merge(ListNode list1, ListNode list2) {
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
