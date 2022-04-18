package AllCodes;

import java.util.*;

class RandomizedSet {

    private Map<Integer,Integer>map;
    private ArrayList<Integer>list;
    private Random r;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        r=new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        
        map.put(val,list.size());
        list.add(val);
        
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        
        int removeIndex=map.get(val);
        map.remove(val);
        if(removeIndex==list.size()-1){
            list.remove(removeIndex);
            return true;
        }
        
        list.set(removeIndex,list.get(list.size()-1));
        
        list.remove(list.size()-1);
        
        map.put(list.get(removeIndex), removeIndex );
        
        return true;
        
    }
    
    public int getRandom() {
        int i = r.nextInt(list.size());
		return list.get(i);
    }
}

public class Insert_Delete_GetRandom {

}
