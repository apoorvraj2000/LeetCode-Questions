package AllCodes;

import java.util.*;

public class Sort_The_Matrix_Diagonally {
	public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        //For Row 0 and col from 0 to n
        for(int i=0;i<n;i++){
            sort(mat,0,i);
        }
        
        //For Col 0 and row from 1 to m
        for(int i=1;i<m;i++){
            sort(mat,i,0);
        }
        
        return mat;
    }
    public void sort(int mat[][],int row,int col){
        int m=mat.length;
        int n=mat[0].length;
        ArrayList<Integer>temp=new ArrayList<>();
        
        int r=row;
        int c=col;
        //add diagonal into a List
        while(r<m && c<n){
            temp.add(mat[r][c]);
            r++;
            c++;
        }
        
        r=row;
        c=col;
        //sort the diagonal
        Collections.sort(temp);
        //again put the sorted diagonal in mat
        int ind=0;
        while(r<m && c<n){
            mat[r][c]=temp.get(ind);
            r++;
            c++;
            ind++;
        }
        
    }
}
