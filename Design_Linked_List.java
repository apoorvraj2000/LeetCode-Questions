package AllCodes;

public class Design_Linked_List {
	private NodeLeet head ;
    private NodeLeet tail ;
    private int size ;

    public Design_Linked_List() {
        this.head = null ;
        this.tail = null ;
        this.size = 0 ;
    }

    public int get(int index) {
        if (head == null){
            return -1 ;
        }

        if (index == 0){
            return head.val ;
        }

        NodeLeet temp = head ;
        for (int i = 0 ; temp != null && i<index ; i++){
            temp = temp.next ;
        }

        if (temp == null){
            return -1 ;
        }

        return temp.val ;
    }

    public void addAtHead(int val) {
        NodeLeet node = new NodeLeet(val);

        if (head == null){
            head = node ;
            tail = node ;
            size++ ;
            return;
        }

        node.next = head ;
        head = node ;
        size++ ;
    }

    public void addAtTail(int val) {
        NodeLeet node = new NodeLeet(val);

        if (tail == null){
            addAtHead(val);
            return;
        }

        tail.next = node ;
        tail = node ;
        size++ ;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0){
            addAtHead(val);
            return;
        }
        if (index == size){
            addAtTail(val);
            return;
        }

        if (index > size || index < 0){
            return;
        }

        NodeLeet temp = head ;
        NodeLeet node = new NodeLeet(val);

        for (int i = 1 ; i < index ;i++){
            temp = temp.next ;
        }

        node.next = temp.next ;
        temp.next = node ;
        size++ ;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0){
            return;
        }
        
        if (index == 0){
            head = head.next ;
            size-- ;
            return;
        }
        
        
        NodeLeet temp = head ;

        for (int i = 1 ; i < index ;i++){
            temp = temp.next ;
        }
        
        if (temp.next == tail){
            tail = temp ;
        }
        temp.next = temp.next.next ;
        size-- ;
        
    }

    private class NodeLeet{
        private int val ;
        private NodeLeet next ;

        public NodeLeet(){
            this.val = 0 ;
            this.next = null ;
        }

        public NodeLeet(int val){
            this.val = val ;
        }
    }
}
