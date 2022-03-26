package AllCodes;

import java.util.Arrays;

public class Two_City_Scheduling {

	public int twoCitySchedCost(int[][] costs) {
        //Sort the array according to difference B/W a and b
        Arrays.sort(costs,(a,b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        
        int cost=0;
        int len=costs.length;
        //add first n a's into cost
        for(int i=0;i<len/2;i++){
            cost+=costs[i][0];
        }
        //add last n b's into cost
        for(int i=len/2;i<len;i++){
            cost+=costs[i][1];
        }
        return cost;
    }
}
