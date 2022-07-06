package AllCodes;

import java.util.ArrayList;

public class Permutation_Sequence {
	public String getPermutation(int n, int k) {
        ArrayList<Integer>arr=new ArrayList<>();
        int fact=1;
        
        for(int i=1;i<n;i++){
            fact*=i;
            
            arr.add(i);
        }
        arr.add(n);
        k--;
        String ans="";
        while(true){
            int ind=k/fact;
            ans+=arr.get(ind);
            
            arr.remove(ind);
            
            if(arr.size()==0){
                break;
            }
            
            k=k%fact;
            fact=fact/arr.size();
        }
        
        return ans;
    }
}
