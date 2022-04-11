package AllCodes;

import java.util.*;

public class Shift_2D_Grid {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;  //total num of rows
        int n=grid[0].length;  //total num of column
        
        int total=n*m;
        // if shifting total times, it shifts back to orignal state
        k=k%total;
        List<List<Integer>> result = new ArrayList<>();
        for(int row=0;row<m;row++){
             List<Integer> temp = new ArrayList<>();
             for (int col=0;col<n;col++){
                 // row * n + col original place index in 1D array
                // row * n + col - k  is to get value k steps before                 
                int index = ((row * n + col) - k + total) % total;
                temp.add(grid[index / n][index % n]);
             } 
            result.add(temp);
        }
        return result;
    }
}
