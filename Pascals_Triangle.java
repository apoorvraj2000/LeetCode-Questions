package AllCodes;

import java.util.*;

public class Pascals_Triangle {
	public List<List<Integer>> generate(int numRows) {
	       List<List<Integer>>ans=new ArrayList<>();
	        List<Integer>currRow;
	        List<Integer>pre=null;
	        
	        for(int i=0;i<numRows;i++){
	            currRow=new ArrayList<>();
	            for(int j=0;j<=i;j++){
	                if(j==0 || j==i){
	                    currRow.add(1);
	                }else{
	                    int a=pre.get(j-1);
	                    int b=pre.get(j);
	                    currRow.add(a+b);
	                }
	                    
	            }
	            pre=currRow;
	            ans.add(currRow);
	        }
	        return ans;
	    }
}
