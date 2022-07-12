package AllCodes;

import java.util.Arrays;

public class Matchsticks_To_Square {
	 public boolean makesquare(int[] matchsticks) {
	        if(matchsticks.length<4)
	            return false;
	        int sum=0;
	        for(int i:matchsticks)
	            sum+=i;
	        
	        if(sum%4!=0)
	            return false;
	        
	        int side=sum/4;
	       
	        Arrays.sort(matchsticks); 
	     
	        reverse(matchsticks);
	        
	        if(matchsticks[0]>side)
	          return false;
	        
	        if(check(matchsticks,0,side,side,side,side))
	            return true;
	        
	        return false;
	    }
	    
	    private boolean check(int[] matchsticks,int ind,int s1,int s2,int s3,int s4){
	        if(ind==matchsticks.length){
	            if(s1==0 && s2==0 && s3==0 && s4==0){
	                return true;
	            }else{
	                return false;
	            }
	        }
	        
	        if(matchsticks[ind]<=s1){
	            s1-=matchsticks[ind];
	            if(check(matchsticks,ind+1,s1,s2,s3,s4)){
	                return true;
	            }
	             s1+=matchsticks[ind];
	        }
	        if(matchsticks[ind]<=s2){
	            s2-=matchsticks[ind];
	            if(check(matchsticks,ind+1,s1,s2,s3,s4)){
	                return true;
	            }
	             s2+=matchsticks[ind];
	        }
	        if(matchsticks[ind]<=s3){
	            s3-=matchsticks[ind];
	            if(check(matchsticks,ind+1,s1,s2,s3,s4)){
	                return true;
	            }
	             s3+=matchsticks[ind];
	        }
	        if(matchsticks[ind]<=s4){
	            s4-=matchsticks[ind];
	            if(check(matchsticks,ind+1,s1,s2,s3,s4)){
	                return true;
	            }
	             s4+=matchsticks[ind];
	        }
	        return false;
	    }
	    public void reverse(int[] array)
	    {
	  
	        // Length of the array
	        int n = array.length;
	  
	        // Swaping the first half elements with last half
	        // elements
	        for (int i = 0; i < n / 2; i++) {
	  
	            // Storing the first half elements temporarily
	            int temp = array[i];
	  
	            // Assigning the first half to the last half
	            array[i] = array[n - i - 1];
	  
	            // Assigning the last half to the first half
	            array[n - i - 1] = temp;
	        }
	    }
}
