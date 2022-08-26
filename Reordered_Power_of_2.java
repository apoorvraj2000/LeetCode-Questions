package AllCodes;

import java.util.Arrays;

public class Reordered_Power_of_2 {
	 public boolean reorderedPowerOf2(int n) {
	        int count[]=countDigit(n);
	        
	        int num=1;
	        
	        for(int i=0;i<31;i++){
	           if(Arrays.equals(count,countDigit(num))){
	               return true;
	           } 
	            num=num<<1;
	        }
	        return false;
	    }
	    public int[]countDigit(int n){
	        int []ans=new int[10];
	        while(n>0){
	            ans[n%10]++;
	            n=n/10;
	        }
	        return ans;
	    }
}
