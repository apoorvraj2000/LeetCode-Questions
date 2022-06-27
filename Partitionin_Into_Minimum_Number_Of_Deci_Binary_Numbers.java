package AllCodes;

public class Partitionin_Into_Minimum_Number_Of_Deci_Binary_Numbers {
	public int minPartitions(String n) {
        int ans=0;
        for(int i=0;i<n.length();i++)
            ans=Math.max(ans,Character.getNumericValue(n.charAt(i)));
        
        return ans;
    }
}
