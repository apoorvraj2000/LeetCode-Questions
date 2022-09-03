package AllCodes;

import java.util.*;

public class Numbers_With_Same_Consecutive_Differences {
	public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        //First digit can not be 0 so we are taking from 1 to 9
        for(int ans = 1; ans < 10; ans++){ 
            find(ans, n-1, k,res); 
        }
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;  
    }
    
    private void find(int ans, int n, int k, List<Integer> res){
        //Base case
        if(n == 0){
            res.add(ans); 
            return;
        }
        
        for(int i = 0; i < 10; i++){
            if(Math.abs(ans%10-i) == k) 
                find(ans*10+i, n-1, k, res);
        }
        // remove last digit while backtrack
        ans /= 10; 
    }
}
