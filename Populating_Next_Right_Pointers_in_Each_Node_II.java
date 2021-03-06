package AllCodes;

public class Populating_Next_Right_Pointers_in_Each_Node_II {


	public Node connect(Node root) {
        Node head=root;
        Node dummy;
        Node tmp;
        while(head!=null)
        {
            dummy=new Node(0);
            tmp=dummy;
            while(head!=null)
            {
                if(head.left!=null)
                {
                    tmp.next=head.left;
                    tmp=tmp.next;
                }
                if(head.right!=null)
                {
                    tmp.next=head.right;
                    tmp=tmp.next;
                }

                head=head.next;
            }

            head=dummy.next;
        }

        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
} 