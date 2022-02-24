package AllCodes;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
        
        if(head.next==null){
            return true;
        }
        ListNode mid=getMid(head);
        
        ListNode newHead=reverse(mid.next);
        
        boolean ans=true;
        while(head!=null && newHead!=null){
            if(head.val!=newHead.val){
                ans=false;
                break;
            }
            head=head.next;
            newHead=newHead.next;
        }
        
        return ans;
        
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)
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
    public ListNode getMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
