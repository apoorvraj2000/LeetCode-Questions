package AllCodes;

public class SortList {

	public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid=getMid(head);
        ListNode newHead=mid.next;
        mid.next=null;
        ListNode l1=sortList(head);
        ListNode l2=sortList(newHead);
        ListNode ans=merg(l1,l2);
        return ans;
    }
    public ListNode getMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merg(ListNode l1,ListNode l2) {
        ListNode head=null;
        ListNode tail=null;
        if(l1.val<=l2.val){
            head=l1;
            tail=l1;
            l1=l1.next;
        }else{
            head=l2;
            tail=l2;
            l2=l2.next;
        }
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
               tail.next=l1;
                tail=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                tail=l2;
                l2=l2.next;
            }
        }
        if(l1!=null){
            tail.next=l1;
        }
        if(l2!=null){
            tail.next=l2;
        }
        return head;
        
    }
}
