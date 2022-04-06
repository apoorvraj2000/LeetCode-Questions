package AllCodes;

import java.util.*;

public class Three_Sum_With_Multiplicity {
	public int threeSumMulti(int[] arr, int target) {
	       long ans=0l;
	        int mod=1000000007;
	        Map<Integer,Long>map=new HashMap<>();
	        for(int i:arr){
	            if(map.containsKey(i)){
	                map.put(i,map.get(i)+1);
	            }else{
	                map.put(i,1l);
	            }
	        }
	        for(int i: map.keySet()){
	           for(int j:map.keySet()){
	               int a=i;//Lock value of a
	               int b=j;// Lock value of b
	               int k=target-(a+b);// calculate the required value
	               
	               //if map does not contain required value
	               if(!map.containsKey(k))
	                   continue;
	               
	               if(a==b && b==k){
	                   //if value of a ,b and k are same so total combinations are
	                  ans+=map.get(a)*(map.get(a)-1)*(map.get(a)-2)/6;
	               }
	               else if(a==b && b!=k){
	                   //if value of a and b are same but k is different so total combinations are
	                   ans+=map.get(a)*(map.get(a)-1)*map.get(k)/2;
	               }
	               else if(a<b && b<k){
	                   //if a less than b and b less than k so total combinations are
	                   ans+=map.get(a)*map.get(b)*map.get(k);
	               }
	               
	           }
	            ans%=mod;
	        }
	        return (int)ans;
	    }
}
