package AllCodes;

public class Spiral_Matrix_II {
	  public int[][] generateMatrix(int n) {
	        int ans[][]=new int[n][n];
	        int r1=0; int c1=0;
	        int r2=n-1; int c2=n-1;
	        int value=1;
	        while(r1<=r2 && c1<=c2){
	            //For left to right
	            for(int i=c1;i<c2;i++){
	                ans[r1][i]=value++;
	            }
	            //For up to down
	            for(int i=r1;i<r2;i++){
	                ans[i][c2]=value++;
	            }
	            //For right to left
	            for(int i=c2;i>c1;i--){
	                ans[r2][i]=value++;
	            }
	            //For down to up
	            for(int i=r2;i>r1;i--){
	                ans[i][c1]=value++;
	            }
	            //If n is odd
	            if(r1==r2 && c1==c2){
	                ans[r1][c1]=value++;
	            }
	            r1++;
	            c1++;
	            r2--;
	            c2--;
	        }
	        return ans;
	    }
}
