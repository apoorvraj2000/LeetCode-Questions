package AllCodes;
class MyHashSet {
    private boolean store[];
    private int size=(int)Math.pow(10,6)+1;
    public MyHashSet() {
        store=new boolean[size];
    }
    
    public void add(int key) {
        store[key]=true;
    }
    
    public void remove(int key) {
        store[key]=false;
    }
    
    public boolean contains(int key) {
        return store[key];
    }
}
public class Design_HashSet {

}
