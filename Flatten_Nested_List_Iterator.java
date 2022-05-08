package AllCodes;

import java.util.*;

class NestedIterator implements Iterator<Integer> {
    private Queue<Integer> ans= new LinkedList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        helper(nestedList,ans);
    }

    @Override
    public Integer next() {
        return ans.remove();
    }

    @Override
    public boolean hasNext() {
        return !ans.isEmpty();
    }
    private void helper(List<NestedInteger> list,  Queue<Integer> ans){
        for(int i=0;i<list.size();i++){
            if(list.get(i).isInteger()){
                ans.add(list.get(i).getInteger());
            }else{
                helper(list.get(i).getList(),ans);
            }
        }
    }
}

public class Flatten_Nested_List_Iterator {

}
interface NestedInteger {
	 
	      // @return true if this NestedInteger holds a single integer, rather than a nested list.
	      public boolean isInteger();
	 
	      // @return the single integer that this NestedInteger holds, if it holds a single integer
	      // Return null if this NestedInteger holds a nested list
	      public Integer getInteger();
	 
	      // @return the nested list that this NestedInteger holds, if it holds a nested list
	      // Return empty list if this NestedInteger holds a single integer
	      public List<NestedInteger> getList();
	  }