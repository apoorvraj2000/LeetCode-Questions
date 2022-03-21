package AllCodes;

public class Watering_Plants {

	 public int wateringPlants(int[] plants, int capacity) {
	        int temp=capacity;
	        int ans=0;
	        int step=0;
	        for(int i=0;i<plants.length;i++) {
	        	if(plants[i]<=capacity) {
	        		capacity=capacity-plants[i];
	        		ans++;
	        	}else {
	        		capacity=temp;
	        		ans=ans+step+(step+1);
	        		capacity=capacity-plants[i];
	        	}
	        	step++;
	        }
	        return ans;
	    }
}
