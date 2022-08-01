package AllCodes;

public class Convert_Binary_Number_In_a_Linked_List_to_Integer {
	public int getDecimalValue(ListNode head) {
        int ans=head.val;
        head=head.next;
        
        while(head!=null){
            ans=ans*2+head.val;
            head=head.next;
        }
        
        return ans;
    }
}
