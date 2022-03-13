package AllCodes;

public class Remove_Duplicates_From_Sorted_List_II {

public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        //Create Dummy node with value 0 pointing to head
        ListNode dummy=new ListNode(0,head);
        //Create previous pointer pointing to dummy
        ListNode prev=dummy;
        
        //Run loop until head!=null
        while(head!=null){
            //check for duplicate values
            if(head.next!=null && head.val==head.next.val){
                //find all duplicate
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next=head.next;
            }else{
                prev=prev.next;
            }
            head=head.next;
        }
        
        return dummy.next;
    }
}
