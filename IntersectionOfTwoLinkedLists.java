package AllCodes;

public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=size(headA);
        int size2=size(headB);
        if(size1>size2){
            while(size1!=size2){
                headA=headA.next;
                size1--;
            }
        }else{
            while(size2!=size1){
                headB=headB.next;
                size2--;
            }
        }
        
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
