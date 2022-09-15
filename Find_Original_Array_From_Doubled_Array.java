package AllCodes;

import java.util.*;

public class Find_Original_Array_From_Doubled_Array {
	public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
       if(n==1 || n%2!=0)
           return new int[0];
       Map<Integer,Integer>map=new HashMap<>();
       for(int i:changed){
           if(map.containsKey(i)){
               map.put(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }
       int indx=0;
       int ans[]=new int[n/2];
       Arrays.sort(changed);
       for(int i:changed){
           if(map.get(i)>0){
                map.put(i,map.get(i)-1);
               int doubl=i*2;
               if(map.containsKey(doubl) && map.get(doubl)>0){
                   map.put(doubl,map.get(doubl)-1);
                   ans[indx]=i;
                   indx++;
               }
           }        
       }
       if(indx!=ans.length)
           return new int[0];
       
       return ans;
   }
}
