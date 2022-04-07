package AllCodes;

import java.util.*;

public class Last_Stone_Weight {
	public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i:stones)
           pq.add(i);
       
       while(pq.size()>1){
           int y=pq.poll();
           int x=pq.poll();
           if(x==y){
               continue;
           }
           else{
               int newWeight=y-x;
               pq.add(newWeight);
           }
       }
       if(pq.isEmpty())
           return 0;
       
       return pq.poll();
   }
}
