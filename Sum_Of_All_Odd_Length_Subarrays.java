package AllCodes;

public class Sum_Of_All_Odd_Length_Subarrays {

	 public int sumOddLengthSubarrays(int[] arr) {
	        int sum=0;
	        for(int i=0;i<arr.length;i++){
	            int tempSum=0;
	            int count=0;
	            for(int j=i;j<arr.length;j++){
	                tempSum+=arr[j];
	                count+=1;
	                if(count%2!=0){
	                    sum+=tempSum;
	                }
	            }
	        }
	        return sum;
	    }
}
