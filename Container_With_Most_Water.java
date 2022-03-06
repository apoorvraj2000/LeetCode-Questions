package AllCodes;

public class Container_With_Most_Water {

	public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(start<end){
            if(height[start]<height[end]){
                int len=height[start];
                int bre=end-start;
                int area=len*bre;
                ans=Math.max(ans,area);
                start++;
            }else{
                 int len=height[end];
                int bre=end-start;
                int area=len*bre;
                ans=Math.max(ans,area);
                end--;
            }
        }
        return ans;
    }
}
