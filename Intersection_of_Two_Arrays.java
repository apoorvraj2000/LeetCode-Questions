package AllCodes;
import java.util.*;
public class Intersection_of_Two_Arrays {

	public int[] intersection(int[] arr1, int[] arr2) {
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],1);
              }
        }
        
        for(int j=0;j<arr2.length;j++){
            if(map.containsKey(arr2[j])){
                     ans.add(arr2[j]);
                     map.remove(arr2[j]);
                }     
        }
        
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}
