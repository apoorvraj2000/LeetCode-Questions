package AllCodes;

import java.util.*;

public class Search_Suggestions_System {
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        //To store the answer
        List<List<String>>ans=new LinkedList<>();
        //Priority Queue to maintain lexicographically minimums products of products
        PriorityQueue<String>pq=new PriorityQueue<>(3, (s1,s2) -> s1.compareTo(s2));
        
        for(int i=1;i<=searchWord.length();i++){
            //get char by char
            String prefix=searchWord.substring(0,i);
            
            //search for prefix in product
            for(int j=0;j<products.length;j++){
                String curr=products[j];
                //if prefix is present add it in a queue
                if(curr.startsWith(prefix))
                    pq.add(curr);
            }
            
            List<String>temp=new LinkedList<>();
            //we only want at max 3 word so run loop from 0->3 
            for(int j=0;j<3;j++){
                if(pq.peek() != null)
                temp.add(pq.poll());
            }
            //clear the queue
            pq.clear();
            //add temp into ans
            ans.add(temp);
        }
        //return ans
        return ans;
    }
}
