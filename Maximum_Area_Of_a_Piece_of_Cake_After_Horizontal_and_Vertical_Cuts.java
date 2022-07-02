package AllCodes;

import java.util.Arrays;

public class Maximum_Area_Of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts {
	public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int mod=(int)Math.pow(10,9)+7;
        
     Arrays.sort(horizontalCuts);
     Arrays.sort(verticalCuts);
        
    long maxH=horizontalCuts[0];
    long maxV=verticalCuts[0];
        
        int hn=horizontalCuts.length;
        for(int i=1;i<horizontalCuts.length;i++){
            maxH=Math.max(maxH,horizontalCuts[i]-horizontalCuts[i-1]);
        }
        
        maxH=Math.max(maxH,h-horizontalCuts[hn-1]);
        
        int vn=verticalCuts.length;
        for(int i=1;i<verticalCuts.length;i++){
            maxV=Math.max(maxV,verticalCuts[i]-verticalCuts[i-1]);
        }
        maxV=Math.max(maxV,w-verticalCuts[vn-1]);
        long ans=(maxH*maxV)%mod;
        return (int)ans;
    }
}
