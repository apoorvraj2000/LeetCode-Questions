package AllCodes;

public class Broken_Calculator {
	 public int brokenCalc(int startValue, int target) {
	        if(startValue>target)
	            return startValue-target;
	        int count=0;
	        
	        while(startValue<target){
	            if(target%2==0){
	                target=target/2;
	            }else{
	                target=target+1;
	            }
	            count++;
	        }
	        return count+startValue-target;
	    }

}
