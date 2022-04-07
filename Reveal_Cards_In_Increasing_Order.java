package AllCodes;

import java.util.*;

public class Reveal_Cards_In_Increasing_Order {
	public int[] deckRevealedIncreasing(int[] deck) {
        int len=deck.length;
        Queue<Integer> q= new LinkedList<>();
        int []ans=new int[len];
        for(int i=0;i<len;i++)
            q.add(i);
        
        Arrays.sort(deck);
        for(int i:deck){
            if(!q.isEmpty()){
                ans[q.remove()]=i;
                if(!q.isEmpty()){
                     int nextTop=q.remove();
                      q.add(nextTop);
                }
               
            }
        }
        return ans;
    }
}
