package AllCodes;

public class LinkedListCycle_II {

	public ListNode detectCycle(ListNode head) {
        if(head==null )
            return head;
        
        ListNode slow=head;
        ListNode fast=head;
        boolean cyclePresent=false;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cyclePresent=true;
                break;
            }
        }
        if(cyclePresent){
            while(head!=slow){
                head=head.next;
                slow=slow.next;
            }
            return head;
        }
        
        return null;
    }
}
