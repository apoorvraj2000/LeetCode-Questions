package AllCodes;

import java.util.Arrays;

class MyHashMap {
private int size=(int)Math.pow(10,6)+1;
private int container[];
    
    public MyHashMap() {    
        container=new int[size];
        Arrays.fill(container, -1);
    }
    
    public void put(int key, int value) {
        container[key]=value;    
    }
    
    public int get(int key) {      
        return container[key];  
    }
    
    public void remove(int key) {     
        container[key]=-1;     
    }
    
}
public class Design_HashMap {

}
