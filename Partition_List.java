package AllCodes;

public class Partition_List {

	public ListNode partition(ListNode head, int x) {
        ListNode smallHead=new ListNode(0);
        ListNode smallTail=smallHead;
        ListNode bigHead=new ListNode(0);
        ListNode bigTail=bigHead;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                smallTail.next=curr;
                smallTail=smallTail.next;
            }else{
                bigTail.next=curr;
                bigTail=bigTail.next;
            }
            curr=curr.next;
        }
        smallTail.next=bigHead.next;
        bigTail.next=null;
        
        return smallHead.next;
    }
}
