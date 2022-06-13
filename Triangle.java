package AllCodes;

import java.util.*;

public class Triangle {
	//Recursive Solution
	public int minimumTotalR(List<List<Integer>> triangle) {
        int ans=helperR(triangle, 0, 0);
        return ans;
        
    }
    
    public int helperR(List<List<Integer>> triangle, int ind, int i){
        
        if(ind==triangle.size()){
            return 0;
        }
        
        List<Integer> temp=triangle.get(ind);
        
        int sum=temp.get(i);
        if(ind< triangle.size()-1)
        {
            sum+=Math.min(helperR(triangle, ind+1, i), helperR(triangle, ind+1, i+1));
        }
        
        return sum;
            
    }
    
    //this is memoization solution
    public int minimumTotalM(List<List<Integer>> triangle) {
        int n=triangle.size();
        int memo[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                memo[i][j]=-1;
            }
        }
        int ans=helperM(triangle, 0, 0,memo);
        return ans;
        
    }
    
    public int helperM(List<List<Integer>> triangle, int ind, int i,int memo[][]){
        
        if(ind==triangle.size()){
            return 0;
        }
        if(memo[ind][i]!=-1)
            return memo[ind][i];
        
        List<Integer> temp=triangle.get(ind);
        
        int sum=temp.get(i);
        if(ind< triangle.size()-1)
        {
            sum+=Math.min(helperM(triangle, ind+1, i, memo), helperM(triangle, ind+1, i+1, memo));
        }
        memo[ind][i]=sum;
        return memo[ind][i];
            
    }
}
