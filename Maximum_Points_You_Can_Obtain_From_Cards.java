package AllCodes;

public class Maximum_Points_You_Can_Obtain_From_Cards {
	public int maxScore(int[] arr, int k) {
	       int sum=0;
	       int max=0;
	        //Include the first k elements in sum
	        for(int i=0;i<k;i++)
	            sum+=arr[i];
	        
	        max=Math.max(sum,max);
	        
	        int i=k-1;
	        int j=arr.length-1;
	        while(i>=0){
	            //remove the ith element from sum
	            sum=sum-arr[i];
	            i--;
	            //add the jth element in sum
	            sum=sum+arr[j];
	            j--;
	            //store the max
	            max=Math.max(sum,max);
	        }
	        return max;
	    }
}
