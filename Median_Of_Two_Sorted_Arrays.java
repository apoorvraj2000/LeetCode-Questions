package AllCodes;

public class Median_Of_Two_Sorted_Arrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int merg[]=new int[n];
        int i=0;
        int j=0;
        int index=0;
        double ans=0.0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                merg[index]=nums1[i];
                i++;
                index++;
            }else{
                 merg[index]=nums2[j];
                 j++;
                 index++;
            }
        }
        while(i<nums1.length){
            merg[index]=nums1[i];
            index++;
            i++;
        }
        while(j<nums2.length){
            merg[index]=nums2[j];
            index++;
            j++;
        }
        int mid=n/2;
        if(n%2==0){
            ans=(merg[mid]+merg[mid-1])/2.0;
        }else{
         ans=merg[mid];   
        }
        return ans;
    }
}
