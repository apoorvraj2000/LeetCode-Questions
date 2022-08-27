package AllCodes;

public class Max_Sum_Of_Rectangle_No_Larger_Than_K {
	public int maxSumSubmatrix(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int preSum[][]=new int[m][n];
        
        //Row wise Pre sum
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j==0){
                    preSum[i][j]=matrix[i][j];
                }else{
                    preSum[i][j]=preSum[i][j-1]+matrix[i][j];
                }
            }
        }
        
        //Col wise pre sum
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                preSum[i][j]+=preSum[i-1][j];
            }
        }
        
        int maxSum=Integer.MIN_VALUE;
        //Fixing top left
        for(int a1=0;a1<m;a1++){
            for(int b1=0;b1<n;b1++){
            	//fixing bottom right
                for(int a2=a1;a2<m;a2++){
                    for(int b2=b1;b2<n;b2++){
                        int currSum=preSum[a2][b2];
                        if(a1>0){
                            currSum-=preSum[a1-1][b2];
                        }
                        if(b1>0){
                            currSum-=preSum[a2][b1-1];
                        }
                        if(a1>0 && b1>0){
                            currSum+=preSum[a1-1][b1-1];
                        }
                        if(currSum<=k && currSum>maxSum){
                            maxSum=currSum;
                        }
                    }
                }
            }
        }
           return maxSum; 
    }
}
