package AllCodes;

import java.util.ArrayList;

public class Swapping_Nodes_In_A_Linked_List {
	public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        int temp=list.get(k-1);
        list.set(k-1,list.get(list.size()-k));
        list.set(list.size()-k,temp);
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=list.get(i);
            i++;
            curr=curr.next;
        }
        return head;
    }
}
